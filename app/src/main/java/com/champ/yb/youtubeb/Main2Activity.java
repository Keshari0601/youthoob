package com.champ.yb.youtubeb;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaActionSound;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.Layout;
import android.view.Gravity;
import android.view.Menu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.IOException;

final public class Main2Activity extends AppCompatActivity {
    static WebView w1,wback;
    ProgressBar ph,p;
    static ConstraintLayout om,omv,complete;
    Boolean playing=false,onhome=false;
    static String proxyusername=null,proxyuserpassword=null;
    static  Boolean b=false,status_playing=false,ser=true,otm=false,onhomename=true,custonviewstatus=false;
    int i=0;
    static int t=0;
    Boolean imageson=true,tnc=false;
    SwipeRefreshLayout mySwipeRefreshLayout;

    //String qualitydata="240";
   // static int tukada=0;
    LinearLayout buttl,buttp;
    Boolean check=true,addshown=false;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private int totalCount;
    static CountDownTimer main;
    String oldURL = "";
    int urlcheck=0;
    String currentURL = "";





    static Bundle webViewBundle;
    static ImageButton option,optionv,fast,fastv,back,backv,next,nextv,pause,pausev;
    static Intent serviceIntent;
    NotificationService n;
    Button bbar,bbarv;
    static String now="No Song Playing",nextsong="Waiting to get response";
    int tou=1;
    CheckBox images,imagesv,loop,loopv;
    FrameLayout customViewContainer;

    Button trending,trendingv,home,homev,subscription,subscriptionv,library,libraryv,download,downloadv,morese,moresev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landscape);


        p=(ProgressBar)findViewById(R.id.progressBar2);
        p.setVisibility(View.INVISIBLE);







        final String PREFS_NAME = "MyPrefsFile";

        w1=(WebView)findViewById(R.id.webview);

         customViewContainer = findViewById(R.id.customViewContainer);
         customViewContainer.setVisibility(View.INVISIBLE);

         complete=(ConstraintLayout)findViewById(R.id.layouttt);
        home=(Button)findViewById(R.id.home);
        homev=(Button)findViewById(R.id.homev);
        subscription=(Button)findViewById(R.id.subscriptions);
        subscriptionv=(Button)findViewById(R.id.subscriptionsv);
        library=(Button)findViewById(R.id.library);
        libraryv=(Button)findViewById(R.id.libraryv);
        download=(Button)findViewById(R.id.download);
        downloadv=(Button)findViewById(R.id.downloadv);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/mainmobileview.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });
        homev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/mainmobileview.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });
        subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/subscriptions.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });

        subscriptionv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/subscriptions.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/library.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });

        libraryv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/library.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(w1.getUrl().indexOf("watch")>-1) {
                    Intent down = new Intent(Main2Activity.this, Download.class);
                    down.setAction(w1.getUrl());
                    startActivity(down);
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"Play a video to download it",Toast.LENGTH_SHORT).show();
                }

                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });


        downloadv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(w1.getUrl().indexOf("watch")>-1) {
                    Intent down = new Intent(Main2Activity.this, Download.class);
                    down.setAction(w1.getUrl());
                    startActivity(down);
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"Play a video to download it",Toast.LENGTH_SHORT).show();
                }



                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });






        final SQLiteDatabase details=openOrCreateDatabase("details",MODE_PRIVATE,null);





        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        prefs = getPreferences(Context.MODE_PRIVATE);
        editor = prefs.edit();
        totalCount = prefs.getInt("counter", 0);
        if(totalCount<30) {
            totalCount++;
            editor.putInt("counter", totalCount);
            editor.commit();
            if (totalCount % 12 == 6) {

                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Main2Activity.this, android.R.style.Theme_Material_Dialog_Alert);
                builder.setTitle("Tips")
                        .setMessage("Try controlling music from notification area in background.")
                        .setPositiveButton("ÖK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                            }
                        })
                        .show();

            }
           /* if (totalCount % 12 == 7) {

                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Main2Activity.this, android.R.style.Theme_Material_Dialog_Alert);
                builder.setTitle("Tips")
                        .setMessage("Struggling with quality? Try changing it from 'Settings' button at leftmost position of bottom panel.")
                        .setPositiveButton("ÖK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                            }
                        })
                        .show();

            }
            */
            if (totalCount % 12 == 3) {

                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Main2Activity.this, android.R.style.Theme_Material_Dialog_Alert);
                builder.setTitle("Tips")
                        .setMessage("If music gets paused while moving in background, press play button from notification area.")
                        .setPositiveButton("ÖK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                            }
                        })
                        .show();

            }
            if (totalCount % 12 == 9) {

                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Main2Activity.this, android.R.style.Theme_Material_Dialog_Alert);
                builder.setTitle("Tips")
                        .setMessage("The forward button can also be utilised to skip advertisements.")
                        .setPositiveButton("ÖK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                            }
                        })
                        .show();

            }
            if (totalCount % 12 == 0) {

                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Main2Activity.this, android.R.style.Theme_Material_Dialog_Alert);
                builder.setTitle("Tips")
                        .setMessage("To watch a video, try screen rotation.")
                        .setPositiveButton("ÖK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                            }
                        })
                        .show();

            }

            if (totalCount % 12 == 11) {

                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Main2Activity.this, android.R.style.Theme_Material_Dialog_Alert);
                builder.setTitle("Tips")
                        .setMessage("'Settings' button includes an option to switch on and off images in order to save data.")
                        .setPositiveButton("ÖK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // continue with delete
                            }
                        })
                        .show();

            }
        }

         if (settings.getBoolean("my_first_time", true)) {
            //the app is being launched for first time, do something

            // first time task
             startActivity(new Intent(Main2Activity.this,tutorial.class));

             // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).commit();
        }
        buttl=(LinearLayout)findViewById(R.id.buttonsv);
        buttp=(LinearLayout)findViewById(R.id.buttons);




        wback=(WebView)findViewById(R.id.wback);
        wback.setVisibility(View.INVISIBLE);

          //  wback.getSettings().setLoadWithOverviewMode(true);


            wback.getSettings().setAllowFileAccess(true);
        wback.getSettings().setAllowFileAccessFromFileURLs(true);
       // moveTaskToBack(true);







        wback.getSettings().setJavaScriptEnabled(true);
        // wback.getSettings().setLoadWithOverviewMode(false);
        w1.getSettings().setAppCacheEnabled(true);


        w1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        wback.getSettings().setAppCacheEnabled(false);

        wback.getSettings().setBuiltInZoomControls(true);
        wback.getSettings().setDisplayZoomControls(false);
        wback.setWebChromeClient(new WebChromeClient() {


                                     public void onProgressChanged(WebView view, int progress) {

                                         if (progress ==100) {
                                             // Toast.makeText(Backadd.this,"sfddefdsc",Toast.LENGTH_LONG).show();




                                         }
                                     }
                                 }
        );
        wback.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null && (url.indexOf("openbrowser")>0)) {
                    view.getContext().startActivity(
                            new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                } else {
                    return false;
                }
            }



            public void onReceivedHttpAuthRequest(WebView view,
                                                  final HttpAuthHandler handler, String host, String realm) {


                handler.proceed( Main2Activity.proxyusername, Main2Activity.proxyuserpassword);


            }

            public void onPageFinished(WebView view, String url) {

                // Toast.makeText(Backadd.this,"sfddefdsc",Toast.LENGTH_LONG).show();

                if(check) {
                    //    Toast.makeText(Main2Activity.this,wback.getUrl(),Toast.LENGTH_SHORT).show();
                    if(wback.getUrl().indexOf("showfa")>0){

                        startActivity(new Intent(Main2Activity.this, frontadd.class));
                        check=false;}
                }








            }

        });







        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {

            }
            public void onFinish(){

                wback.loadUrl("http://champu.xyz/yb/ba.html");
                reloadad();
            }}.start();
        // startActivity(new Intent(Backadd.this,Main2Activity.class));





       /* try{
            webViewBundle=getIntent().getExtras();

        }
        finally{}
       */
        playing=false;
        bbar=(Button)findViewById(R.id.bbar) ;
        bbarv=(Button)findViewById(R.id.bbarv);
        trending=(Button)findViewById(R.id.trending) ;
        trendingv=(Button)findViewById(R.id.trendingv) ;
       // refresh=(Button)findViewById(R.id.refresh) ;
        //refreshv=(Button)findViewById(R.id.refreshv) ;
        //history=(Button)findViewById(R.id.history) ;
        //historyv=(Button)findViewById(R.id.historyv) ;
        //quality=(Button)findViewById(R.id.quality) ;
        //qualityv=(Button)findViewById(R.id.qualityv) ;
        images=(CheckBox)findViewById(R.id.images);
        imagesv=(CheckBox)findViewById(R.id.imagesv);
      //  autoplay=(CheckBox)findViewById(R.id.autoplay);
       // autoplayv=(CheckBox)findViewById(R.id.autoplayv);
        loop=(CheckBox)findViewById(R.id.loop);
        loopv=(CheckBox)findViewById(R.id.loopv);
        morese=(Button)findViewById(R.id.mores);
        moresev=(Button)findViewById(R.id.moresv);
        // Intent intent=new Intent(Main2Activity.this,Backadd.class);
       // intent.addFlags(FLAG)
        //startActivity(intent);
       // getIntent().
        morese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           startActivity(new Intent(Main2Activity.this,more.class));
            }
        });
        moresev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Main2Activity.this,more.class));
            }
        });



        details.execSQL("create table if not exists quality (q varchar)");
        details.execSQL("create table if not exists proxy (username varchar,password varchar)");
        details.execSQL("create table if not exists image (status varchar)");

        String s2="select * from quality";
        Cursor c =details.rawQuery(s2,null);
        if(c.getCount()==0)
        {
            details.execSQL("insert into quality values('240')");


        }
        c.close();


        s2="select * from image";
        c =details.rawQuery(s2,null);
        if(c.getCount()==0)
        {
            details.execSQL("insert into image values('on')");


        }
        c.close();
        s2="select * from proxy";
        c =details.rawQuery(s2,null);
        if(c.getCount()>0)
        {
            Cursor c1= details.rawQuery("SELECT * FROM proxy",null);
            c1.moveToFirst();
            proxyusername=c1.getString(0);
            proxyuserpassword=c1.getString(1);

        }
        c.close();
        s2="select * from image";
        c =details.rawQuery(s2,null);
        if(c.getCount()>0)
        {
            Cursor c1= details.rawQuery("SELECT * FROM image",null);
            c1.moveToFirst();
            if(c1.getString(0).equals("on"))
            {
                imageson=true;
            }
            else
            {
                imageson=false;

            }
        }
        c.close();
      /*  s2="select * from quality";
        c =details.rawQuery(s2,null);
        if(c.getCount()>0)
        {
            Cursor c1= details.rawQuery("SELECT * FROM quality",null);
            c1.moveToFirst();
            qualitydata=c1.getString(0);
        }
        c.close();
*/






       // p=(ProgressBar)findViewById(R.id.progressBar4);
        pause=(ImageButton)findViewById(R.id.status_bar_playlayout);
        pausev=(ImageButton)findViewById(R.id.status_bar_playlayoutv);
        next=(ImageButton)findViewById(R.id.status_bar_next);
        nextv=(ImageButton)findViewById(R.id.status_bar_nextv);
        fast=(ImageButton)findViewById(R.id.status_bar_ff);
        fastv=(ImageButton)findViewById(R.id.status_bar_ffv);
        back=(ImageButton)findViewById(R.id.status_bar_bb);
        backv=(ImageButton)findViewById(R.id.status_bar_bbv);
        option=(ImageButton)findViewById(R.id.option);
        optionv=(ImageButton)findViewById(R.id.optionv);
        om=(ConstraintLayout) findViewById(R.id.optionlayoutm);
        om.setVisibility(View.INVISIBLE);
        omv=(ConstraintLayout)findViewById(R.id.optionlayoutmv);
        omv.setVisibility(View.INVISIBLE);
        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!otm){
                om.setVisibility(View.VISIBLE);
                otm=true;
                option.setClickable(false);}




            }
        });
        optionv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!otm){
                    omv.setVisibility(View.VISIBLE);
                    otm=true;
                    optionv.setClickable(false);}




            }
        });
        om.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);
                otm = false;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        option.setClickable(true);

                        optionv.setClickable(true);
                    }
                }.start();
                return false;
            }
        });
        omv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);
                otm=false;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        option.setClickable(true);

                        optionv.setClickable(true);
                    }
                }.start();

              //  removeadd();


                   /* w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
                    w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");

                    w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                        "\n" +
                        "        \n" +
                        "var isPlaying = function(e) {\n" +
                        "           \n" +
                        "window.Android.showToast(\"playing\"); \n" +
                        "        };\n" +
                        "   \n" +
                        " var onPause = function(e) { \n" +
                        " \n" +
                        "window.Android.showToast(\"paused\"); \n" +
                        "        };\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                        "       \n" +
                        " media.addEventListener(\"pause\", onPause, false);");

                }*/
                tou++;
                return false;

            }
        });
        trending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/trendingmv.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });
        trendingv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/trendingmv.html");
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();

            }
        });
    /*    history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/history.html");
                om.setVisibility(View.INVISIBLE);

                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();
            }
        });
        historyv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.loadUrl("http://champu.xyz/yb/history.html");
                om.setVisibility(View.INVISIBLE);

                omv.setVisibility(View.INVISIBLE);

                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {

                        optionv.setClickable(true);
                        option.setClickable(true);
                    }
                }.start();
            }
        });
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.reload();
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);
                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        optionv.setClickable(true);


                        option.setClickable(true);
                    }
                }.start();
            }
        });
        refreshv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w1.reload();
                om.setVisibility(View.INVISIBLE);
                omv.setVisibility(View.INVISIBLE);
                otm=false;
                t=0;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        optionv.setClickable(true);


                        option.setClickable(true);
                    }
                }.start();
            }
        });*/
      /*  quality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setTitle("Select Quality\n(Suggested 240p)");



                Context context = Main2Activity.this;
                LinearLayout box = new LinearLayout(context);
                box.setOrientation(LinearLayout.HORIZONTAL);


                final TextView tttttt=new TextView(Main2Activity.this);
                tttttt.setWidth(100);
                box.addView(tttttt);

                final RadioGroup qual = new RadioGroup(Main2Activity.this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                qual.setOrientation(LinearLayout.VERTICAL);


                final RadioButton q1080 = new RadioButton(Main2Activity.this);
                q1080.setText("1080p");

                qual.addView(q1080);


                final RadioButton q720 = new RadioButton(Main2Activity.this);
                q720.setText("720p");

                qual.addView(q720);

                final RadioButton q480 = new RadioButton(Main2Activity.this);
                q480.setText("480p");
                qual.addView(q480);


                final RadioButton q360 = new RadioButton(Main2Activity.this);

                q360.setText("360p");
                qual.addView(q360);

                final RadioButton q240 = new RadioButton(Main2Activity.this);
                q240.setText("240p");

                qual.addView(q240);

                final RadioButton q144 = new RadioButton(Main2Activity.this);
                q144.setText("144p");
                qual.addView(q144);

                final RadioButton Auto = new RadioButton(Main2Activity.this);
                Auto.setText("Auto");
                qual.addView(Auto);

                if(qualitydata.equals("240"))
                {
                    q240.setChecked(true);
                }
                else if(qualitydata.equals("144"))
                {
                    q144.setChecked(true);
                }
                else if(qualitydata.equals("360"))
                {
                    q360.setChecked(true);
                }
                else if(qualitydata.equals("480"))
                {
                    q480.setChecked(true);
                }
                else if(qualitydata.equals("720"))
                {
                    q720.setChecked(true);
                }
                else if(qualitydata.equals("1080"))
                {
                    q1080.setChecked(true);
                }
                else if(qualitydata.equals("Auto"))
                {
                    Auto.setChecked(true);
                }
              //  Toast.makeText(Main2Activity.this,qualitydata,Toast.LENGTH_SHORT).show();




                box.addView(qual);





                builder.setView(box);

// Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String ffs="240";
                        if(q1080.isChecked()) {
                            ffs="1080";
                        }
                        else if(q720.isChecked())
                        {
                            ffs="720";
                        }
                        else if(q480.isChecked())
                        {
                            ffs="480";
                        }
                        else if(q360.isChecked())
                        {
                            ffs="360";
                        }
                        else if(q240.isChecked())
                        {
                            ffs="240";
                        }
                        else if(q144.isChecked())
                        {
                            ffs="144";
                        }
                        else if(Auto.isChecked())
                        {
                            ffs="Auto";
                        }
                        details.execSQL("DELETE FROM quality");
                    //    Toast.makeText(Main2Activity.this,ffs,Toast.LENGTH_SHORT).show();
                        details.execSQL("insert into quality values('"+ffs+"')");


                        qualitydata=ffs;
                        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-button ytp-settings-button\")[0].click();\n" +
                                "\n" +
                                "\n");
                        w1.loadUrl("javascript:var i=0;\n" +
                                "while(i<12)\n" +
                                "{\n" +
                                "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                                "if(c==\"Quality\")\n" +
                                "{\n" +
                                "\n" +
                                "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                                "break;\n" +
                                "}\n" +
                                "i++;}\n" );
                        w1.loadUrl("javascript:"+
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "var i=0;\n" +
                                "while(i<17)\n" +
                                "{\n" +
                                "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                                "if(c.indexOf("+qualitydata+")>-1)\n" +
                                "{\n" +
                                "\n" +
                                "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                                "break;\n" +
                                "}\n" +
                                "i++;\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "}\n" +
                                "\n");
                        w1.loadUrl("javascript:document.getElementsByTagName(\"div\")[0].click();");



                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show().getWindow().setLayout(700,1100);;











                omv.setVisibility(View.INVISIBLE);
                om.setVisibility(View.INVISIBLE);
                otm=false;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        optionv.setClickable(true);


                        option.setClickable(true);
                    }
                }.start();
            }
        });

        qualityv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setTitle("Select Quality... (Suggested 240p)");



                Context context = Main2Activity.this;
                LinearLayout box = new LinearLayout(context);
                box.setOrientation(LinearLayout.HORIZONTAL);


                final TextView tttttt=new TextView(Main2Activity.this);
                tttttt.setWidth(100);
                box.addView(tttttt);

                final RadioGroup qual = new RadioGroup(Main2Activity.this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                qual.setOrientation(LinearLayout.VERTICAL);


                final RadioButton q1080 = new RadioButton(Main2Activity.this);
                q1080.setText("1080p");

                qual.addView(q1080);


                final RadioButton q720 = new RadioButton(Main2Activity.this);
                q720.setText("720p");

                qual.addView(q720);

                final RadioButton q480 = new RadioButton(Main2Activity.this);
                q480.setText("480p");
                qual.addView(q480);


                final RadioButton q360 = new RadioButton(Main2Activity.this);

                q360.setText("360p");
                qual.addView(q360);

                final RadioButton q240 = new RadioButton(Main2Activity.this);
                q240.setText("240p");

                qual.addView(q240);

                final RadioButton q144 = new RadioButton(Main2Activity.this);
                q144.setText("144p");
                qual.addView(q144);

                final RadioButton Auto = new RadioButton(Main2Activity.this);
                Auto.setText("Auto");
                qual.addView(Auto);

                if(qualitydata.equals("240"))
                {
                    q240.setChecked(true);
                }
                else if(qualitydata.equals("144"))
                {
                    q144.setChecked(true);
                }
                else if(qualitydata.equals("360"))
                {
                    q360.setChecked(true);
                }
                else if(qualitydata.equals("480"))
                {
                    q480.setChecked(true);
                }
                else if(qualitydata.equals("720"))
                {
                    q720.setChecked(true);
                }
                else if(qualitydata.equals("1080"))
                {
                    q1080.setChecked(true);
                }
                else if(qualitydata.equals("Auto"))
                {
                    Auto.setChecked(true);
                }
                //  Toast.makeText(Main2Activity.this,qualitydata,Toast.LENGTH_SHORT).show();




                box.addView(qual);





                builder.setView(box);

// Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String ffs="240";
                        if(q1080.isChecked()) {
                            ffs="1080";
                        }
                        else if(q720.isChecked())
                        {
                            ffs="720";
                        }
                        else if(q480.isChecked())
                        {
                            ffs="480";
                        }
                        else if(q360.isChecked())
                        {
                            ffs="360";
                        }
                        else if(q240.isChecked())
                        {
                            ffs="240";
                        }
                        else if(q144.isChecked())
                        {
                            ffs="144";
                        }
                        else if(Auto.isChecked())
                        {
                            ffs="Auto";
                        }
                        details.execSQL("DELETE FROM quality");
                        //    Toast.makeText(Main2Activity.this,ffs,Toast.LENGTH_SHORT).show();
                        details.execSQL("insert into quality values('"+ffs+"')");


                        qualitydata=ffs;
                        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-button ytp-settings-button\")[0].click();\n" +
                                "\n" +
                                "\n");
                        w1.loadUrl("javascript:var i=0;\n" +
                                "while(i<12)\n" +
                                "{\n" +
                                "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                                "if(c==\"Quality\")\n" +
                                "{\n" +
                                "\n" +
                                "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                                "break;\n" +
                                "}\n" +
                                "i++;}\n" );
                        w1.loadUrl("javascript:"+
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "var i=0;\n" +
                                "while(i<17)\n" +
                                "{\n" +
                                "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                                "if(c.indexOf("+qualitydata+")>-1)\n" +
                                "{\n" +
                                "\n" +
                                "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                                "break;\n" +
                                "}\n" +
                                "i++;\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "}\n" +
                                "\n");
                        w1.loadUrl("javascript:document.getElementsByTagName(\"div\")[0].click();");


                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show().getWindow().setLayout(700,1100);;











                omv.setVisibility(View.INVISIBLE);
                om.setVisibility(View.INVISIBLE);
                otm=false;

                new CountDownTimer(100, 50) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        optionv.setClickable(true);


                        option.setClickable(true);
                    }
                }.start();
            }
        });*/
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               pause_play();
            }
        });
        pausev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause_play();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
        nextv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              fast();            }
        });
        fastv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fast();            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
        backv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });







        n=new NotificationService();
        serviceIntent = new Intent(Main2Activity.this, n.getClass());
        serviceIntent.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);

        startService(serviceIntent);


      //  p.setVisibility(View.INVISIBLE);
        ph=(ProgressBar)findViewById(R.id.progressBar);
        //ph.setProgressTintList(ColorStateList.valueOf(Color.BLUE));
        ph.setVisibility(View.INVISIBLE);







        class webinter {

            Context mContext;

            webinter(Context c) {
                mContext = c;
            }
            @JavascriptInterface

            public void nextsongget(String s){
                //   Toast.makeText(Main2Activity.this,"fvsgrvfc",Toast.LENGTH_SHORT).show();

               nextsong=s;
               if(onhomename){
               startService(serviceIntent);}

            }
          /*  @JavascriptInterface

            public void autoplayscript(String s){
             //   Toast.makeText(Main2Activity.this,"fvsgrvfc",Toast.LENGTH_SHORT).show();

                if(s.equals("true"))
                {
                    autoplay.setChecked(true);
                    autoplayv.setChecked(true);
                }
                else
                {
                    autoplay.setChecked(false);
                    autoplayv.setChecked(true);

                }

            }*/
          @JavascriptInterface

          public void nosongplaying(){
              //   Toast.makeText(Main2Activity.this,"fvsgrvfc",Toast.LENGTH_SHORT).show();

              status_playing=false;
              now="No Song Playing";
              nextsong="No Song Playing";



              startService(serviceIntent);
          }

            @JavascriptInterface

            public void nosongplaying12911(){
                //   Toast.makeText(Main2Activity.this,"fvsgrvfc",Toast.LENGTH_SHORT).show();

                status_playing=false;
                startService(serviceIntent);
            }


            @JavascriptInterface

            public void currentsong(String s){
                //   Toast.makeText(Main2Activity.this,"fvsgrvfc",Toast.LENGTH_SHORT).show();

                now=s;
                if(onhomename){
                startService(serviceIntent);}

            }
            @JavascriptInterface
            public void showToast(String toast) {



                playing=true;
                if(!onhome) {
                    new CountDownTimer(50, 50) {

                        public void onTick(long millisUntilFinished) {
                            //here you can have your logic to set text to edittext
                        }

                        public void onFinish() {
                            if(!onhome) {

                                playing = false;
                            }
                        }

                    }.start();

                }
                    if(toast.equals("playing")){
                        status_playing=true;
                        if(ser){
                        startService(serviceIntent);}
                            pause.setImageResource(R.drawable.apollo_holo_dark_pause);

                            pausev.setImageResource(R.drawable.apollo_holo_dark_pause);

                    }
                    else {
                        status_playing = false;
                        if (ser) {
                            startService(serviceIntent);
                        }
                        pause.setImageResource(R.drawable.apollo_holo_dark_play);
                        pausev.setImageResource(R.drawable.apollo_holo_dark_play);
                    }





            }

        }


        w1.getSettings().setJavaScriptEnabled(true);
        w1.getSettings().setLoadWithOverviewMode(true);
        w1.addJavascriptInterface(new webinter(this), "Android");

                  // w1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
      //  w1.getSettings().setAppCacheEnabled(false);
         w1.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        w1.getSettings().setGeolocationEnabled(true);
        w1.getSettings().setSupportMultipleWindows(true);
        // This forces ChromeClient enabled.






        w1.getSettings().setBuiltInZoomControls(true);
        w1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if(i%10==1) {
                //    delete_element();
                    removeadd();


                    w1.loadUrl("javascript: for (event_name of [\"visibilitychange\", \"webkitvisibilitychange\", \"blur\"]) {\n" +
                            "  window.addEventListener(event_name, function(event) {\n" +
                            "        event.stopImmediatePropagation();\n" +
                            "    }, true);\n" +
                            "}");


                    w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
                    w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");

                    w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                            "\n" +
                            "        \n" +
                            "var isPlaying = function(e) {\n" +
                            "           \n" +
                            "window.Android.showToast(\"playing\"); \n" +
                            "        };\n" +
                            "   \n" +
                            " var onPause = function(e) { \n" +
                            " \n" +
                            "window.Android.showToast(\"paused\"); \n" +
                            "        };\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                            "       \n" +
                            " media.addEventListener(\"pause\", onPause, false);");

                }
                i++;
                return false;
            }
        });
















        if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE) {

            om.setVisibility(View.INVISIBLE);
            omv.setVisibility(View.INVISIBLE);
            buttp.getLayoutParams().height=1;
            buttp.requestLayout();
            bbar.setVisibility(View.INVISIBLE);
            bbarv.setVisibility(View.VISIBLE);

        }

        else
        {
            om.setVisibility(View.INVISIBLE);
            omv.setVisibility(View.INVISIBLE);

            buttl.getLayoutParams().width=1;
            buttl.requestLayout();
            bbarv.setVisibility(View.INVISIBLE);
            bbar.setVisibility(View.VISIBLE);

        }


















        w1.setWebChromeClient(new WebChromeClient() {




            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
                super.onShowCustomView(view,callback);
                complete.setVisibility(View.INVISIBLE);
                custonviewstatus=true;
                w1.setVisibility(View.GONE);
                customViewContainer.setVisibility(View.VISIBLE);
                customViewContainer.addView(view);

                getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
                new CountDownTimer(500,500)
                {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        if (!(android.provider.Settings.System.getInt(
                                getContentResolver(),
                                Settings.System.ACCELEROMETER_ROTATION, 0) == 1)){

                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);}

                    }
                }.start();



            }
            public void onHideCustomView () {

                complete.setVisibility(View.VISIBLE);
                super.onHideCustomView();
                w1.setVisibility(View.VISIBLE);
                custonviewstatus=false;
                customViewContainer.setVisibility(View.GONE);
                getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                       );
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);

            }


            public void onProgressChanged(WebView view, int progress) {
                ph.setProgress(progress);


                if (progress == 100) {
                    p.setVisibility(View.GONE);
                    ph.setVisibility(View.GONE);
                    b=true;
                    loop.setChecked(false);
                    loopv.setChecked(false);
                    checkcurrentong();
                    w1.loadUrl("javascript:var i=0;\n" +
                            "var k=0;\n" +
                            "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                            "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                            "{\n" +
                            "k++;\n" +
                            "break;\n" +
                            "}\n" +
                            "i++;\n" +
                            "}\n" +
                            "if(k!=0)\n" +
                            "{\n" +
                            "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                            "" +
                            "if(window.location.href.indexOf('watch')==-1)\n" +
                            "{" +
                            "window.Android.nextsongget('No song playing');" +
                            "" +
                            "}" +
                            "else" +
                            "{" +
                            " window.Android.nextsongget(next);\n" +
                            "}" +
                            "\n" +
                            "}\n" +
                            "else\n" +
                            "{\n" +
                            "var i789=0;\n" +
                            "while(1){\n" +
                            "\n" +
                            "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                            "                break;}\n" +
                            "                i789++;\n" +
                            "                }\n" +
                            "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                            "if(window.location.href.indexOf('watch')==-1)\n" +
                            "{" +
                            "window.Android.nextsongget('No song playing');" +
                            "" +
                            "}" +
                            "else" +
                            "{" +
                            " window.Android.nextsongget(next);\n" +
                            "}" +

                            "}\n");


                  //  delete_element();
                    removeadd();

                    w1.loadUrl("javascript: for (event_name of [\"visibilitychange\", \"webkitvisibilitychange\", \"blur\"]) {\n" +
                            "  window.addEventListener(event_name, function(event) {\n" +
                            "        event.stopImmediatePropagation();\n" +
                            "    }, true);\n" +
                            "}");

                    w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
                    w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");


                    w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                            "\n" +
                            "        \n" +
                            "var isPlaying = function(e) {\n" +
                            "           \n" +
                            "window.Android.showToast(\"playing\"); \n" +
                            "        };\n" +
                            "   \n" +
                            " var onPause = function(e) { \n" +
                            " \n" +
                            "window.Android.showToast(\"paused\"); \n" +
                            "        };\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                            "       \n" +
                            " media.addEventListener(\"pause\", onPause, false);");

                } else {
                    p.setVisibility(View.VISIBLE);
                    b=false;
                    ph.setVisibility(View.VISIBLE);

                }
            }



            public void onReceivedTitle(WebView view, String title)
            {
                new CountDownTimer(200,300)
                {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        play();

                    }
                }.start();


               /* if(view.getUrl().toString().indexOf("youtube")>-1){
                tukada++;
                if(tukada%5==0)
                {
                final String url=w1.getUrl().toString();

                w1.loadUrl("javascript:location.replace(\""+url+"\");\n" +
                        "\n");
                /*    new CountDownTimer(1000,1000)
                    {
                        @Override
                        public void onTick(long l) {

                        }

                        @Override
                        public void onFinish() {
                            w1.loadUrl(url);

                        }
                    }.start();




                }
                }*/

                //now=title;
                checkplaying();
         //       w1.loadUrl("javascript:window.Android.nextsongget(document.getElementsByClassName(\"ytp-next-button ytp-button\")[0].getAttribute(\"data-tooltip-text\"));");
                //delete_element();
                t=0;
                //removeadd();
               // checkplaying();
           /*     w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-button ytp-settings-button\")[0].click();\n" +
                        "\n" +
                        "\n");
                w1.loadUrl("javascript:var i=0;\n" +
                        "while(i<12)\n" +
                        "{\n" +
                        "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                        "if(c==\"Quality\")\n" +
                        "{\n" +
                        "\n" +
                        "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;}\n" );
                w1.loadUrl("javascript:"+
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "var i=0;\n" +
                        "while(i<17)\n" +
                        "{\n" +
                        "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                        "if(c.indexOf("+qualitydata+")>-1)\n" +
                        "{\n" +
                        "\n" +
                        "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "}\n" +
                        "\n");*/


                new CountDownTimer(20000, 3000) {

                    public void onTick(long millisUntilFinished) {

                       if(w1.getUrl().contains("watch")){
                        checkplaying();
                       }
                        checkcurrentong();
                        w1.loadUrl("javascript:var i=0;\n" +
                                    "var k=0;\n" +
                                    "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                                    "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                                    "{\n" +
                                    "k++;\n" +
                                    "break;\n" +
                                    "}\n" +
                                    "i++;\n" +
                                    "}\n" +
                                    "if(k!=0)\n" +
                                    "{\n" +
                                    "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                                    "" +
                                "if(window.location.href.indexOf('watch')==-1)\n" +
                                "{" +
                                "window.Android.nextsongget('No song playing');" +
                                "" +
                                "}" +
                                "else" +
                                "{" +
                                " window.Android.nextsongget(next);\n" +
                                "}" +      "\n" +
                                    "}\n" +
                                    "else\n" +
                                    "{\n" +
                                    "var i789=0;\n" +
                                    "while(1){\n" +
                                    "\n" +
                                    "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                                    "                break;}\n" +
                                    "                i789++;\n" +
                                    "                }\n" +
                                    "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                                    "      " +
                                "" +
                                "" +
                                "" +
                                "if(window.location.href.indexOf('watch')==-1)\n" +
                                "{" +
                                "window.Android.nextsongget('No song playing');" +
                                "" +
                                "}" +
                                "else" +
                                "{" +
                                " window.Android.nextsongget(next);\n" +
                                "}" +
                                    "}\n");



                        w1.loadUrl("javascript:document.getElementsByClassName(\"videoAdUiExperimentalSkipIcon videoAdUiFixedPaddingSkipButtonIcon\")[0].click();");

                        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-ad-skip-button ytp-button\")[0].click();");


                        /*if(millisUntilFinished>50000) {
                            w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-button ytp-settings-button\")[0].click();\n" +
                                    "\n" +
                                    "\n");
                            w1.loadUrl("javascript:var i=0;\n" +
                                    "while(i<12)\n" +
                                    "{\n" +
                                    "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                                    "if(c==\"Quality\")\n" +
                                    "{\n" +
                                    "\n" +
                                    "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                                    "break;\n" +
                                    "}\n" +
                                    "i++;}\n");
                            w1.loadUrl("javascript:" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "var i=0;\n" +
                                    "while(i<17)\n" +
                                    "{\n" +
                                    "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                                    "if(c.indexOf(" + qualitydata + ")>-1)\n" +
                                    "{\n" +
                                    "\n" +
                                    "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                                    "break;\n" +
                                    "}\n" +
                                    "i++;\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "}\n" +
                                    "\n");
                            w1.loadUrl("javascript:document.getElementsByTagName(\"div\")[0].click();");

                        }*/
                    }

                    public void onFinish(){

                    }
                    }.start();


                w1.loadUrl("javascript: for (event_name of [\"visibilitychange\", \"webkitvisibilitychange\", \"blur\"]) {\n" +
                        "  window.addEventListener(event_name, function(event) {\n" +
                        "        event.stopImmediatePropagation();\n" +
                        "    }, true);\n" +
                        "}");


                w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
                w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");

                w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                        "\n" +
                        "        \n" +
                        "var isPlaying = function(e) {\n" +
                        "           \n" +
                        "window.Android.showToast(\"playing\"); \n" +
                        "        };\n" +
                        "   \n" +
                        " var onPause = function(e) { \n" +
                        " \n" +
                        "window.Android.showToast(\"paused\"); \n" +
                        "        };\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                        "       \n" +
                        " media.addEventListener(\"pause\", onPause, false);");


            }

        });


        w1.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Mobile Safari/537.36");

        if (webViewBundle != null){
            w1.restoreState(webViewBundle);

        } else {
            w1.loadUrl("http://champu.xyz/yb/main.html");

        }

        w1.getSettings().setDisplayZoomControls(false);

        w1.setWebViewClient(new WebViewClient () {
         /*   @Override
            public WebResourceResponse shouldInterceptRequest (final WebView view, String url) {
                Toast.makeText(Main2Activity.this,"phuch gya",Toast.LENGTH_SHORT).show();

                if (url.indexOf("desktopplayer")>0) {
                    Toast.makeText(Main2Activity.this,"kuch mila",Toast.LENGTH_SHORT).show();
                    return super.shouldInterceptRequest(view, url);

                } else {
                    return super.shouldInterceptRequest(view, url);
                }
            }
           */ @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
             //   Toast.makeText(Main2Activity.this, "Your Internet Connection May not be active Or "+"\n"+w1.getUrl().toString(), Toast.LENGTH_LONG).show();

                w1.loadData("<title>Waiting....</title><br><udaka><h1>No Internet Access</h1><h1>Tap here to refresh</h1><udaka><style>udaka {\n" +
                        "    background: red;\n" +
                        "    text-align: center;\n" +
                        "}</style><script>document.body.addEventListener('click', fn, true); \n" +
                        "function fn(){\n" +
                        "location.replace('"+failingUrl+"');\n" +
                        "}</script>", "text/html; charset=UTF-8", null);


               // super.onReceivedError(view, errorCode, description, failingUrl);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

               view.loadUrl(url);

                return false;
            }



            public void onPageFinished(WebView view, String url) {
                //delete_element();

                main.cancel();

                oldURL="";
                currentURL="";
                status_playing=false;
                now="No song playing";
                nextsong="No song playing";

                pause.setImageResource(R.drawable.apollo_holo_dark_play);


                removeadd();
                main.start();


               /* w1.loadUrl("javascript: var oldURL = \"\";\n" +
                        "var urlcheck=0;\n" +
                        "var currentURL = window.location.href;\n" +
                        "function checkURLchange(currentURL){\n" +
                        "\n" +
                        "if(urlcheck>0&&urlcheck<4)\n" +
                        "{\n" +
                        "if(currentURL!=null&&currentURL.indexOf(\"watch\")==-1)\n" +
                        "{\n" +
                        "window.Android.nosongplaying();\n" +
                        "}\n" +
                        "    else{        \n" +
                        "window.Android.currentsong(document.getElementsByTagName(\"h2\")[0].innerHTML);" +
                        "" +
                        "var i=0;\n" +
                "var k=0;\n" +
                        "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                        "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                        "{\n" +
                        "k++;\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;\n" +
                        "}\n" +
                        "if(k!=0)\n" +
                        "{\n" +
                        "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                        " " +
                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +"\n" +
                        "}\n" +
                        "else\n" +
                        "{\n" +
                        "var i789=0;\n" +
                        "while(1){\n" +
                        "\n" +
                        "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                        "                break;}\n" +
                        "                i789++;\n" +
                        "                }\n" +
                        "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                        "       " +
                        "" +
                        "" +
                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +

                        "}\n"+
                        "" +
                        "" +
                        "" +
                        "" +
                        "       \n" +
                        "\n" +
                        "    }\n" +
                        "\t\turlcheck++;\n" +
                        "}\n" +



                        "\n" +

                        "if(currentURL != oldURL){\n" +
                        "if(currentURL!=null&&currentURL.indexOf(\"watch\")==-1)\n" +
                        "{\n" +
                        "window.Android.nosongplaying();\n" +
                        "urlcheck=1;\n" +
                        "}\n" +
                        "    else{        \n" +
                        "window.Android.currentsong(document.getElementsByTagName(\"h2\")[0].innerHTML);" +
                        "" +
                        "var i=0;\n" +
                "var k=0;\n" +
                        "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                        "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                        "{\n" +
                        "k++;\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;\n" +
                        "}\n" +
                        "if(k!=0)\n" +
                        "{\n" +
                        "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                        "" +
                        "" +
                        "" +
                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +


                        "\n" +
                        "}\n" +
                        "else\n" +
                        "{\n" +
                        "var i789=0;\n" +
                        "while(1){\n" +
                        "\n" +
                        "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                        "                break;}\n" +
                        "                i789++;\n" +
                        "                }\n" +
                        "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                        "" +
                        "" +
                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +"}\n"+
                        "" +
                        "" +
                        "" +
                        "" +
                        "        oldURL = currentURL;\n" +
                        "\t\turlcheck=1;\n" +
                        "    }}\n" +
                        "\n" +
                        "\n" +
                        "    oldURL = window.location.href;\n" +
                        "    setInterval(function() {\n" +
                        "        checkURLchange(window.location.href);\n" +
                        "    }, 2000);\n" +
                        "}\n" +
                        "\n" +
                        "checkURLchange();\n");

*/

                loop.setChecked(false);
                loopv.setChecked(false);
                mySwipeRefreshLayout.setRefreshing(false);

                w1.loadUrl("javascript: for (event_name of [\"visibilitychange\", \"webkitvisibilitychange\", \"blur\"]) {\n" +
                        "  window.addEventListener(event_name, function(event) {\n" +
                        "        event.stopImmediatePropagation();\n" +
                        "    }, true);\n" +
                        "}");


                w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",check,false);");
                w1.loadUrl("javascript:var media = document.getElementsByTagName('video')[0];\n" +
                        "var check = function(e) {\n" +
                        "\n" +
                        "window.Android.currentsong(document.getElementsByTagName(\"h2\")[0].innerHTML);"+
                        "var i=0;\n" +
                        "var k=0;\n" +
                        "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                        "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                        "{\n" +
                        "k++;\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;\n" +
                        "}\n" +
                        "if(k!=0)\n" +
                        "{\n" +
                        "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                        " " +
                        "" +

                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +

                        "" +
                        "\n" +
                        "}\n" +
                        "else\n" +
                        "{\n" +
                        "var i789=0;\n" +
                        "while(1){\n" +
                        "\n" +
                        "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                        "                break;}\n" +
                        "                i789++;\n" +
                        "                }\n" +
                        "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                        "     " +

                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +

                        "" +
                        "" +
                        "" +
                        "}"+
                        "};\n" +
                        "media.addEventListener(\"playing\", check, false);                   ");
                w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
                w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");

                w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                        "\n" +
                        "        \n" +
                        "var isPlaying = function(e) {\n" +
                        "           \n" +
                        "window.Android.showToast(\"playing\"); \n" +
                        "        };\n" +
                        "   \n" +
                        " var onPause = function(e) { \n" +
                        " \n" +
                        "window.Android.showToast(\"paused\"); \n" +
                        "        };\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                        "       \n" +
                        " media.addEventListener(\"pause\", onPause, false);");


            }


            public void onReceivedHttpAuthRequest(WebView view,
                                                  final HttpAuthHandler handler, String host, String realm) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                builder.setTitle("Proxy Authentication required");

                Context context = Main2Activity.this;
                LinearLayout box = new LinearLayout(context);
                box.setOrientation(LinearLayout.VERTICAL);

// Add a TextView here for the "Title" label, as noted in the comments

// Set up the input
                final EditText username = new EditText(Main2Activity.this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                username.setInputType(InputType.TYPE_CLASS_TEXT );
                username.setHint("Username");
                username.setText(proxyusername);
                box.addView(username);
                final EditText password = new EditText(Main2Activity.this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
                password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                password.setHint("Password");
                password.setText(proxyuserpassword);
                box.addView(password);
                builder.setView(box);

// Set up the buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        proxyusername=username.getText().toString();
                        proxyuserpassword=password.getText().toString();
                        details.execSQL("DELETE FROM proxy");
                        details.execSQL("insert into proxy values('"+proxyusername+"','"+proxyuserpassword+"')");


                        handler.proceed( username.getText().toString(), password.getText().toString());
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        });

        if(imageson){
            images.setChecked(true);
            imagesv.setChecked(true);
            w1.getSettings().setLoadsImagesAutomatically(true);  // perform logic

        }

        else
        {
            w1.getSettings().setLoadsImagesAutomatically(false);  // perform logic

            images.setChecked(false);
            imagesv.setChecked(false);

        }
        images.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {

                if ( isChecked )
                {
                    imagesv.setChecked(true);
                    details.execSQL("DELETE FROM image");
                    details.execSQL("insert into image values('on')");

                    w1.getSettings().setLoadsImagesAutomatically(true);  // perform logic
                }
                else
                {
                    imagesv.setChecked(false);

                    details.execSQL("DELETE FROM image");
                    details.execSQL("insert into image values('off')");


                    w1.getSettings().setLoadsImagesAutomatically(false);  // perform logic


                }

            }
        });
        imagesv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    images.setChecked(true);

                    details.execSQL("DELETE FROM image");
                    details.execSQL("insert into image values('on')");

                    w1.getSettings().setLoadsImagesAutomatically(true);  // perform logic
                }
                else
                {
                    images.setChecked(false);

                    details.execSQL("DELETE FROM image");
                    details.execSQL("insert into image values('off')");


                    w1.getSettings().setLoadsImagesAutomatically(false);  // perform logic


                }

            }
        });
        loop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {


                if(isChecked)
                {
                    loopv.setChecked(true);

                    w1.loadUrl("javascript:document.getElementsByTagName('video')[0].addEventListener('ended',myHandler,false);\n" +
                            "    function myHandler(e) {\n" +
                            "document.getElementsByTagName('video')[0].play();\n" +
                            "    }");
                }
                else
                {
                    loopv.setChecked(false);

                    w1.loadUrl("javascript:document.getElementsByTagName('video')[0].removeEventListener('ended', myHandler);");
                }



            }
        });
        loopv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {


                if(isChecked)
                {
                    loop.setChecked(true);

                    w1.loadUrl("javascript:document.getElementsByTagName('video')[0].addEventListener('ended',myHandler,false);\n" +
                            "    function myHandler(e) {\n" +
                            "document.getElementsByTagName('video')[0].play();\n" +
                            "    }");
                }
                else
                {
                    loop.setChecked(false);

                    w1.loadUrl("javascript:document.getElementsByTagName('video')[0].removeEventListener('ended', myHandler);");
                }



            }
        });







        main=new CountDownTimer(10000000,5000) {
            @Override
            public void onTick(long l) {

                    checkURLchange(w1.getUrl());



            }

            @Override
            public void onFinish() {

            }
        };







        mySwipeRefreshLayout = (SwipeRefreshLayout)this.findViewById(R.id.swipeContainer);
        mySwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        w1.reload();
                    }
                }
        );






        //    autoplay.setChecked(true);
      //  autoplayv.setChecked(true);


    /*    autoplay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked) {
                    autoplayv.setChecked(true);
                    autoplaybool=true;
                }
                else
                {
                    autoplayv.setChecked(false);

                    autoplaybool=false;
                }
                new CountDownTimer(3000, 500) {

                        public void onTick(long millisUntilFinished) {
                            w1.loadUrl("javascript:if(document.getElementById(\"improved-toggle\").getAttribute(\"aria-pressed\")==\""+!autoplaybool+"\")\n" +
                                    "   {\n" +
                                    "\n" +
                                    "document.getElementById(\"improved-toggle\").click();\n" +
                                    "\n" +
                                    "}");



                        }

                        public void onFinish() {

                            w1.loadUrl("javascript:if(document.getElementById(\"improved-toggle\").getAttribute(\"aria-pressed\")==\""+!autoplaybool+"\")\n" +
                                    "   {\n" +
                                    "\n" +
                                    "document.getElementById(\"improved-toggle\").click();\n" +
                                    "\n" +
                                    "}");


                        }

                    }.start();




            }
        });
        autoplayv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked) {
                    autoplay.setChecked(true);
                    autoplaybool=true;
                }
                else
                {
                    autoplay.setChecked(false);

                    autoplaybool=false;
                }

                new CountDownTimer(3000, 500) {

                    public void onTick(long millisUntilFinished) {
                        w1.loadUrl("javascript:if(document.getElementById(\"improved-toggle\").getAttribute(\"aria-pressed\")==\""+!autoplaybool+"\")\n" +
                                "   {\n" +
                                "\n" +
                                "document.getElementById(\"improved-toggle\").click();\n" +
                                "\n" +
                                "}");



                    }

                    public void onFinish() {

                        w1.loadUrl("javascript:if(document.getElementById(\"improved-toggle\").getAttribute(\"aria-pressed\")==\""+!autoplaybool+"\")\n" +
                                "   {\n" +
                                "\n" +
                                "document.getElementById(\"improved-toggle\").click();\n" +
                                "\n" +
                                "}");


                    }

                }.start();



            }
        });*/



    }

    @Override
    public void onBackPressed() {
        if(om.getVisibility()==View.VISIBLE||omv.getVisibility()==View.VISIBLE)
        {
            om.setVisibility(View.INVISIBLE);
            omv.setVisibility(View.INVISIBLE);
            otm=false;
            optionv.setClickable(true);

            option.setClickable(true);


        }
        else{
        if (w1.canGoBack()) {
          //  nextsong=now;
            w1.goBack();
        } else {
            if(!addshown){
                w1.destroy();
                addshown=true;
                wback.setVisibility(View.VISIBLE);
                bbarv.setVisibility(View.INVISIBLE);
                bbar.setVisibility(View.INVISIBLE);


            }
            else {

    stopService(serviceIntent);

    super.onBackPressed();
         android.os.Process.killProcess(android.os.Process.myPid());

        }
            }}
    }

    @Override
    protected void onPause() {


        super.onPause();
        // w1.onResume();
        onhome = true;

        onhomename=false;

        w1.loadUrl("javascript: for (event_name of [\"visibilitychange\", \"webkitvisibilitychange\", \"blur\"]) {\n" +
                "  window.addEventListener(event_name, function(event) {\n" +
                "        event.stopImmediatePropagation();\n" +
                "    }, true);\n" +
                "}");

        // trigger=false;
        w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
        w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");

        w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                "\n" +
                "        \n" +
                "var isPlaying = function(e) {\n" +
                "           \n" +
                "window.Android.showToast(\"playing\"); \n" +
                "        };\n" +
                "   \n" +
                " var onPause = function(e) { \n" +
                " \n" +
                "window.Android.showToast(\"paused\"); \n" +
                "        };\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                "       \n" +
                " media.addEventListener(\"pause\", onPause, false);");


        new CountDownTimer(200, 50) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {


                new CountDownTimer(1000, 50) {

                    public void onTick(long millisUntilFinished) {
                        if (playing) {

                            w1.loadUrl("javascript:document.getElementsByTagName('video')[0].play();");
                        }
                    }

                    public void onFinish() {
                        playing = false;
                        //  trigger = true;
                        onhomename=true;
                        startService(serviceIntent);
                    }

                }.start();
            }


        }.start();
       // w1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);


    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        webViewBundle = new Bundle();
        w1.saveState(webViewBundle);
        om.setVisibility(View.INVISIBLE);
        omv.setVisibility(View.INVISIBLE);
        otm = false;

        new CountDownTimer(100, 50) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {

                option.setClickable(true);

                optionv.setClickable(true);
            }
        }.start();
        super.onConfigurationChanged(newConfig);

        /*    if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE) {

            setContentView(R.layout.vertical);
        }
        else
        {
            setContentView(R.layout.landscape);

        }
*/
        reassemble();


        // Checks the orientation of the screen

    }
    @Override
    public void onDestroy (){
        super.onDestroy();
            webViewBundle = new Bundle();
            w1.saveState(webViewBundle);



    }

    @Override
    public void onResume (){

        onhome=false;
      //  trigger=true;

        playing=false;
        ser=true;

        super.onResume();


        if(custonviewstatus)
        {
            getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                    | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        }
        else
        {
            getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            );

        }

    }


    public void startService(View v) {
        Intent serviceIntent = new Intent(Main2Activity.this, NotificationService.class);
        serviceIntent.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);
        startService(serviceIntent);
    }
    static final public void pause_play()
    {
        main.cancel();
        main.start();
       checkplaying();
       checkcurrentong();

        w1.loadUrl("javascript:var i=0;\n" +
                "var k=0;\n" +
                "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                "{\n" +
                "k++;\n" +
                "break;\n" +
                "}\n" +
                "i++;\n" +
                "}\n" +
                "if(k!=0)\n" +
                "{\n" +
                "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "if(window.location.href.indexOf('watch')==-1)\n" +
                "{" +
                "window.Android.nextsongget('No song playing');" +
                "" +
                "}" +
                "else" +
                "{" +
                " window.Android.nextsongget(next);\n" +
                "}" +


                "\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "var i789=0;\n" +
                "while(1){\n" +
                "\n" +
                "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                "                break;}\n" +
                "                i789++;\n" +
                "                }\n" +
                "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                "       " +
                "" +

                "if(window.location.href.indexOf('watch')==-1)\n" +
                "{" +
                "window.Android.nextsongget('No song playing');" +
                "" +
                "}" +
                "else" +
                "{" +
                " window.Android.nextsongget(next);\n" +
                "}" +

                "" +
                "" +
                "" +
                "" +
                "" +
                "}\n");

        w1.loadUrl("javascript: for (event_name of [\"visibilitychange\", \"webkitvisibilitychange\", \"blur\"]) {\n" +
                "  window.addEventListener(event_name, function(event) {\n" +
                "        event.stopImmediatePropagation();\n" +
                "    }, true);\n" +
                "}");

        w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"playing\",isplaying,false);");
        w1.loadUrl("javascript: document.getElementsByTagName('video')[0].removeEventListener(\"pause\",onPause,false);");

        w1.loadUrl("javascript: var media = document.getElementsByTagName('video')[0];\n" +
                "\n" +
                "        \n" +
                "var isPlaying = function(e) {\n" +
                "           \n" +
                "window.Android.showToast(\"playing\"); \n" +
                "        };\n" +
                "   \n" +
                " var onPause = function(e) { \n" +
                " \n" +
                "window.Android.showToast(\"paused\"); \n" +
                "        };\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "media.addEventListener(\"playing\", isPlaying, false);    \n" +
                "       \n" +
                " media.addEventListener(\"pause\", onPause, false);");
        if(t<5)
        {
            pause();
            t++;
        }


        if(status_playing)
        {
            pause();
        }
        else
        {
            play();
        }
    }
    static final public void play()
    {
        w1.loadUrl("javascript:document.getElementsByTagName(\"video\")[0].play();");



    }
    static final public void pause()
    {
        w1.loadUrl("javascript:document.getElementsByTagName(\"video\")[0].pause();");


    }
    static final public void next()
    {

            w1.loadUrl("javascript:var i789=0;\n" +
                    "var k789=0;\n" +
                    "while(i789<5)\n" +
                    "{\n" +
                    "if(document.getElementsByClassName(\"c3-material-button-button\")[i789].getAttribute(\"aria-label\")==\"Next video\")\n" +
                    "{\n" +
                    "document.getElementsByClassName(\"c3-material-button-button\")[i789].click();\n" +
                    "k789++;\n" +
                    "break;\n" +
                    "}\n" +
                    "\n" +
                    "i789++;\n" +
                    "\n" +
                    "}\n" +
                    "if(k789==0)\n" +
                    "{\n" +
                    "\n" +
                    "i789=0;\n" +
                    "while(1)\n" +
                    "{\n" +
                    "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                    "break;\n" +
                    "}\n" +
                    "i789++;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "document.getElementsByTagName(\"div\")[i789+1].childNodes[0].click();\n" +
                    "}" +
                    "" +
                    "" +
                    "" +
                    "" +
                    "");

    }
    static final public void previous()
    {
       // nextsong=now;
        w1.goBack();

    }
    static final public void fast()
    {



        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-ad-skip-button ytp-button\")[0].click();");
        w1.loadUrl("javascript:var vid=document.getElementsByTagName('video')[0];\n" +
                "\n" +
                "vid.currentTime=vid.currentTime+5;\n" +
                "\n");
    }

    static final public void back()
    {



        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-ad-skip-button ytp-button\")[0].click();");

        w1.loadUrl("javascript:var vid=document.getElementsByTagName('video')[0];\n" +
                "\n" +
                "vid.currentTime=vid.currentTime-5;\n" +
                "\n");

    }
    static final public void full_screen()
    {
        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-fullscreen-button ytp-button\")[0].click();");
    }

    /*public void delete_element()
    {

       // w1.clearCache(true);

        w1.loadUrl("javascript:var element = document.getElementById(\"contentContainer\");\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementById(\"guide-button\");\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"style-scope ytd-masthead style-default\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"style-scope ytd-masthead notification-button-style-type-conversation-default\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"notification-button-style-type-default style-scope ytd-masthead\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"style-scope ytd-masthead style-default\")[0];\n" +
                "    \n" +
                "    element.parentNode.removeChild(element);\n" +
                "\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"ytp-chrome-top ytp-share-button-visible\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"ytp-unmute ytp-popup ytp-button ytp-unmute-animated ytp-unmute-shrink\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"ytp-popup ytp-contextmenu\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"style-scope ytd-menu-popup-renderer\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"dropdown-trigger style-scope ytd-menu-renderer\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"style-scope ytd-menu-renderer force-icon-button style-default size-default\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementById(\"masthead-ad\");\n" +
                "    element.parentNode.removeChild(element);\n");
        //w1.loadUrl("javascript:");
        //w1.loadUrl("javascript:");



    }*/
    public void removeadd()
    {
       /* w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-button ytp-settings-button\")[0].click();\n" +
                "\n" +
                "\n");
        w1.loadUrl("javascript:var i=0;\n" +
                "while(i<12)\n" +
                "{\n" +
                "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                "if(c==\"Quality\")\n" +
                "{\n" +
                "\n" +
                "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                "break;\n" +
                "}\n" +
                "i++;}\n" );
                w1.loadUrl("javascript:"+
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "var i=0;\n" +
                "while(i<17)\n" +
                "{\n" +
                "var c=document.getElementsByClassName(\"ytp-menuitem-label\")[i].innerText;\n" +
                "if(c.indexOf("+qualitydata+")>-1)\n" +
                "{\n" +
                "\n" +
                "document.getElementsByClassName(\"ytp-menuitem-label\")[i].click();\n" +
                "break;\n" +
                "}\n" +
                "i++;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "}\n" +
                "\n");
*/
     /*   if(autoplay.isChecked())
        {
            w1.loadUrl("javascript:if(document.getElementById(\"improved-toggle\").getAttribute(\"aria-pressed\")==\"false\")\n" +
                    "{\n" +
                    "document.getElementById(\"improved-toggle\").click();\n" +
                    "}\n" +
                    "\n" +
                    "\n");
        }
        else
        {
            w1.loadUrl("javascript:if(document.getElementById(\"improved-toggle\").getAttribute(\"aria-pressed\")==\"true\")\n" +
                    "{\n" +
                    "document.getElementById(\"improved-toggle\").click();\n" +
                    "}\n" +
                    "\n" +
                    "\n");
        }*/
        //w1.clearCache(true);

        w1.loadUrl("javascript:document.getElementsByClassName(\"ytp-ad-skip-button ytp-button\")[0].click();");
        w1.loadUrl("javascript:document.getElementsByClassName(\"close-padding condensed contains-svg\")[0].click();");

        w1.loadUrl("javascript:document.getElementsByClassName(\"videoAdUiExperimentalSkipIcon videoAdUiFixedPaddingSkipButtonIcon\")[0].click();");


        w1.loadUrl("javascript:var element = document.getElementsByClassName(\"ytp-ad-overlay-slot\")[0];\n" +
                "    element.parentNode.removeChild(element);\n");
        w1.loadUrl("javascript:var element = document.getElementById(\"player-ads\");\n" +
                "    element.parentNode.removeChild(element);\n" +
                "\n");

    }
    static public void checkplaying()
    {
        w1.loadUrl("javascript: try{var mediacheck = document.getElementsByTagName('video')[0];\n" +
                "if (mediacheck.paused) {" +
                "window.Android.showToast(\"paused\"); \n" +
                "}" +
                "else{" +
                "window.Android.showToast(\"playing\"); \n" +
                "        }}" +
                "catch{" +
                "" +
             //   "window.Android.nosongplaying12911();" +
                "" +
                "" +
                "}\n" );


    }

    public static void stopser(){
        ser=false;
        pause();
    }
    public void reassemble()
    {

        if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE) {

            om.setVisibility(View.INVISIBLE);
           omv.setVisibility(View.INVISIBLE);
           buttl.getLayoutParams().width=buttp.getHeight();

            buttp.getLayoutParams().height=1;
            buttl.requestLayout();
            buttp.requestLayout();
            bbar.setVisibility(View.INVISIBLE);
            bbarv.setVisibility(View.VISIBLE);

        }

        else
        {
            om.setVisibility(View.INVISIBLE);
            omv.setVisibility(View.INVISIBLE);
            buttp.getLayoutParams().height=buttl.getWidth();
            buttp.requestLayout();

            buttl.getLayoutParams().width=1;
            buttl.requestLayout();
            bbarv.setVisibility(View.INVISIBLE);
            bbar.setVisibility(View.VISIBLE);

        }


    }

    public void reloadad()
    {
        new CountDownTimer(1200000,1000)
        {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                check=true;

                wback.loadUrl("http://champu.xyz/yb/ba.html");
                reloadad();

            }
        }.start();
    }
    static public void checkcurrentong()
    {
        w1.loadUrl("javascript:if(window.location.href.indexOf('watch')==-1)\n" +
                "{" +
                "window.Android.currentsong('No song playing');" +
                "" +
                "}" +

                "else" +
                "{" +
                "window.Android.currentsong(document.getElementsByTagName(\"h2\")[0].innerHTML);" +
                "}");

    }
    public void checkURLchange(String currentURL){

        if(urlcheck<4)
        {
            if(currentURL!=null&&currentURL.indexOf("watch")==-1)
            {


            }
            else
            {

                checkcurrentong();

                w1.loadUrl("javascript:var i=0;\n" +
                        "var k=0;\n" +
                        "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                        "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                        "{\n" +
                        "k++;\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;\n" +
                        "}\n" +
                        "if(k!=0)\n" +
                        "{\n" +
                        "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +


                        "\n" +
                        "}\n" +
                        "else\n" +
                        "{\n" +
                        "var i789=0;\n" +
                        "while(1){\n" +
                        "\n" +
                        "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                        "                break;}\n" +
                        "                i789++;\n" +
                        "                }\n" +
                        "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                        "       " +
                        "" +

                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +

                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "}\n");




            }
            urlcheck++;
        }

        if(currentURL != oldURL){
            if(currentURL!=null&&currentURL.indexOf("watch")==-1)
            {

            }
            else{


                checkcurrentong();

                w1.loadUrl("javascript:var i=0;\n" +
                        "var k=0;\n" +
                        "while(i<document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\").length){\n" +
                        "if(document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i].getAttribute(\"selected\")==\"true\")\n" +
                        "{\n" +
                        "k++;\n" +
                        "break;\n" +
                        "}\n" +
                        "i++;\n" +
                        "}\n" +
                        "if(k!=0)\n" +
                        "{\n" +
                        "var next=document.getElementsByTagName(\"ytm-playlist-panel-video-renderer\")[i+1].childNodes[0].childNodes[1].childNodes[0].childNodes[0].innerText;\n" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +


                        "\n" +
                        "}\n" +
                        "else\n" +
                        "{\n" +
                        "var i789=0;\n" +
                        "while(1){\n" +
                        "\n" +
                        "if(document.getElementsByTagName(\"div\")[i789].getAttribute(\"class\")==\"c3-material-toggle-button-circle\"){\n" +
                        "                break;}\n" +
                        "                i789++;\n" +
                        "                }\n" +
                        "var next=document.getElementsByTagName(\"div\")[i789+1].childNodes[1].childNodes[0].childNodes[0].innerHTML;\n" +
                        "       " +
                        "" +

                        "if(window.location.href.indexOf('watch')==-1)\n" +
                        "{" +
                        "window.Android.nextsongget('No song playing');" +
                        "" +
                        "}" +
                        "else" +
                        "{" +
                        " window.Android.nextsongget(next);\n" +
                        "}" +

                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "}\n");




                oldURL = currentURL;
                urlcheck=1;
            }}


        oldURL = w1.getUrl();
    }


}



