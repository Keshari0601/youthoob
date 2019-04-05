package com.champ.yb.youtubeb;

import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class frontadd extends AppCompatActivity {
    WebView wback;
    Button skipadd;
    Boolean check=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontadd);
        wback=(WebView)findViewById(R.id.webviewFrontadd);
        wback.getSettings().setJavaScriptEnabled(true);
       // wback.getSettings().setLoadWithOverviewMode(false);
       /* wback.getSettings().setAllowContentAccess(true);
        wback.getSettings().setAllowFileAccess(true);
        wback.getSettings().setAllowFileAccessFromFileURLs(true);


        // w1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        */wback.getSettings().setAppCacheEnabled(false);

        skipadd=(Button)findViewById(R.id.skip);
        skipadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        skipadd.setClickable(false);
        wback.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null && (url.indexOf("openbrowser") > 0)) {
                    view.getContext().startActivity(
                            new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                } else {
                    return false;
                }
            }

            public void onReceivedHttpAuthRequest(WebView view,
                                                  final HttpAuthHandler handler, String host, String realm) {


                handler.proceed(Main2Activity.proxyusername, Main2Activity.proxyuserpassword);


            }
        });

     /*   wback.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wback.getSettings().setSupportMultipleWindows(true);



        wback.getSettings().setBuiltInZoomControls(true);
        wback.getSettings().setDisplayZoomControls(false);
        wback.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                Intent i=new Intent(frontadd.this,out.class);
                i.setAction(url);
                startActivity(i);

                return true;
            }


        });
        wback.setWebChromeClient(new WebChromeClient() {


                                     public void onProgressChanged(WebView view, int progress) {

                                         if (progress >80) {
                                             // Toast.makeText(Backadd.this,"sfddefdsc",Toast.LENGTH_LONG).show();


                                             if(check) {
                                                 Intent i=new Intent(frontadd.this, out.class);
                                                i.setAction(wback.getUrl().toString());
                                                startActivity(i);
                                                check=false;
                                             }

                                         }
                                         if(progress==100)
                                         {
                                             check=true;
                                         }
                                     }
                                 }
        );

*/
  /*      wback.setWebViewClient(new WebViewClient () {

            public void onReceivedHttpAuthRequest(WebView view,
                                                  final HttpAuthHandler handler, String host, String realm) {


                handler.proceed( Main2Activity.proxyusername, Main2Activity.proxyuserpassword);


            }});

*/
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                skipadd.setText("You Can Skip in "+Long.toString((millisUntilFinished/1000))+" seconds");

            }
            public void onFinish(){

                skipadd.setText("Skip");
                skipadd.setClickable(true);

            }}.start();
       wback.loadUrl("http://champu.xyz/yb/fa.html");


    }
    @Override
    public void onBackPressed() {

    }
    }
