package com.champ.yb.youtubeb;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.marothiatechs.customnotification.action.main";
        public static String INIT_ACTION = "com.marothiatechs.customnotification.action.init";
        public static String PREV_ACTION = "com.marothiatechs.customnotification.action.prev";
        public static String BACK_ACTION = "com.marothiatechs.customnotification.action.back";
        public static String FAST_ACTION = "com.marothiatechs.customnotification.action.fast";
        public static String PLAY_ACTION = "com.marothiatechs.customnotification.action.play";
        public static String NEXT_ACTION = "com.marothiatechs.customnotification.action.next";
        public static String STARTFOREGROUND_ACTION = "com.marothiatechs.customnotification.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.marothiatechs.customnotification.action.stopforeground";
        public static String UPDATE = "com.marothiatechs.customnotification.action.update";

    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
     }
     public interface channelname{
         public static CharSequence obj = "Udaka";

     }
    public static Bitmap getDefaultAlbumArt(Context context) {
        Bitmap bm = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            bm = BitmapFactory.decodeResource(context.getResources(),
                    R.mipmap.icon, options);
        } catch (Error ee) {
        } catch (Exception e) {
        }
        return bm;
    }

}