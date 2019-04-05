package com.champ.yb.youtubeb;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.IBinder;
import android.app.Service;
import android.content.Intent;
import android.app.Notification;
import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.RemoteViews;
import android.widget.Toast;

public class NotificationService extends Service {




    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        if (intent.getAction().equals(Constants.ACTION.STARTFOREGROUND_ACTION)) {
            showNotification();
         //   Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();

        } else if (intent.getAction().equals(Constants.ACTION.PREV_ACTION)) {
            Main2Activity.previous();
           // Toast.makeText(this, "Clicked Previous", Toast.LENGTH_SHORT).show();
            Log.i(LOG_TAG, "Clicked Previous");
        }
        else if (intent.getAction().equals(Constants.ACTION.BACK_ACTION)) {
            Main2Activity.back();
           // Toast.makeText(this, "Clicked back", Toast.LENGTH_SHORT).show();
            Log.i(LOG_TAG, "Clicked Previous");
        }
        else if (intent.getAction().equals(Constants.ACTION.FAST_ACTION)) {
            Main2Activity.fast();
           // Toast.makeText(this, "Clicked fast", Toast.LENGTH_SHORT).show();
            Log.i(LOG_TAG, "Clicked Previous");
        }else if (intent.getAction().equals(Constants.ACTION.PLAY_ACTION)) {
            Main2Activity.pause_play();





           // Toast.makeText(this, "Clicked Play", Toast.LENGTH_SHORT).show();
            Log.i(LOG_TAG, "Clicked Play");
        } else if (intent.getAction().equals(Constants.ACTION.NEXT_ACTION)) {
            Main2Activity.next();
           // Toast.makeText(this, "Clicked Next", Toast.LENGTH_SHORT).show();
            Log.i(LOG_TAG, "Clicked Next");
        } else if (intent.getAction().equals(
                Constants.ACTION.STOPFOREGROUND_ACTION)) {

            Log.i(LOG_TAG, "Received Stop Foreground Intent");
           // Toast.makeText(this, "Service Stoped", Toast.LENGTH_SHORT).show();
            stopForeground(true);
            stopSelf();
            Main2Activity.stopser();

            stopService(Main2Activity.serviceIntent);

             android.os.Process.killProcess(android.os.Process.myPid());
        }
        return START_STICKY;
    }
    static Notification status;
    private final String LOG_TAG = "NotificationService";

    static RemoteViews views;
    static RemoteViews bigViews;




    private void showNotification() {
// Using RemoteViews to bind custom layouts into Notification
        views = new RemoteViews(getPackageName(),
                R.layout.status_bar);
        bigViews = new RemoteViews(getPackageName(),
                R.layout.status_bar_expanded);
// showing default album image


        Intent notificationIntent = new Intent(this, Main2Activity.class);
       // notificationIntent.setAction(Constants.ACTION.MAIN_ACTION);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, 0);

        Intent previousIntent = new Intent(this, NotificationService.class);
        previousIntent.setAction(Constants.ACTION.PREV_ACTION);
        PendingIntent ppreviousIntent = PendingIntent.getService(this, 0,
                previousIntent, 0);

        Intent playIntent = new Intent(this, NotificationService.class);
        playIntent.setAction(Constants.ACTION.PLAY_ACTION);
        PendingIntent pplayIntent = PendingIntent.getService(this, 0,
                playIntent, 0);



        Intent nextIntent = new Intent(this, NotificationService.class);
        nextIntent.setAction(Constants.ACTION.NEXT_ACTION);
        PendingIntent pnextIntent = PendingIntent.getService(this, 0,
                nextIntent, 0);



        Intent fastIntent = new Intent(this, NotificationService.class);
        fastIntent.setAction(Constants.ACTION.FAST_ACTION);
        PendingIntent pfastIntent = PendingIntent.getService(this, 0,
                fastIntent, 0);

        Intent backIntent = new Intent(this, NotificationService.class);
        backIntent.setAction(Constants.ACTION.BACK_ACTION);
        PendingIntent pbackIntent = PendingIntent.getService(this, 0,
                backIntent, 0);







        Intent closeIntent = new Intent(this, NotificationService.class);
        closeIntent.setAction(Constants.ACTION.STOPFOREGROUND_ACTION);
        PendingIntent pcloseIntent = PendingIntent.getService(this, 0,
                closeIntent, 0);


        bigViews.setOnClickPendingIntent(R.id.status_bar_close, pcloseIntent);
        views.setOnClickPendingIntent(R.id.status_bar_close, pcloseIntent);

        views.setOnClickPendingIntent(R.id.status_bar_playnv, pplayIntent);
        bigViews.setOnClickPendingIntent(R.id.status_bar_playnb, pplayIntent);

        views.setOnClickPendingIntent(R.id.status_bar_next, pnextIntent);
        bigViews.setOnClickPendingIntent(R.id.status_bar_next, pnextIntent);

        views.setOnClickPendingIntent(R.id.status_bar_prev, ppreviousIntent);
        bigViews.setOnClickPendingIntent(R.id.status_bar_prev, ppreviousIntent);

        bigViews.setOnClickPendingIntent(R.id.status_bar_ff, pfastIntent);

        bigViews.setOnClickPendingIntent(R.id.status_bar_bb, pbackIntent);

        if(!Main2Activity.status_playing) {

            views.setImageViewResource(R.id.status_bar_playnv,
                    R.drawable.apollo_holo_dark_play);
            bigViews.setImageViewResource(R.id.status_bar_playnb,
                    R.drawable.apollo_holo_dark_play);
            Main2Activity.pausev.setImageResource(R.drawable.apollo_holo_dark_play);


        }
        else
        {
            views.setImageViewResource(R.id.status_bar_playnv,
                    R.drawable.apollo_holo_dark_pause);
            bigViews.setImageViewResource(R.id.status_bar_playnb,
                    R.drawable.apollo_holo_dark_pause);
            Main2Activity.pausev.setImageResource(R.drawable.apollo_holo_dark_pause);

        }

        views.setTextViewText(R.id.status_bar_track_name1, Main2Activity.now);
        bigViews.setTextViewText(R.id.status_bar_track_name, Main2Activity.now);
        bigViews.setTextViewText(R.id.now, "Now: ");
        bigViews.setTextViewText(R.id.next, "Next: ");

        bigViews.setTextViewText(R.id.status_bar_artist_name, Main2Activity.nextsong);



        status = new NotificationCompat.Builder(this, "Udaka")
                    .setChannelId("Udaka")
                .build();



        status.defaults = 0;
        status.contentView = views;
        status.bigContentView = bigViews;
        status.flags = Notification.FLAG_ONGOING_EVENT;
        status.icon = R.drawable.beta;
        status.contentIntent = pendingIntent;
        if(Build.VERSION.SDK_INT>=26) {
            NotificationChannel channel = new NotificationChannel("Udaka", Constants.channelname.obj, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setSound(null,null);
            channel.setDescription("Notification Service");
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(channel);
        }

        startForeground(Constants.NOTIFICATION_ID.FOREGROUND_SERVICE, status);



    }








}
