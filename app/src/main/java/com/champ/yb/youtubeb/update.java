package com.champ.yb.youtubeb;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class update extends AppCompatActivity {
    String versionname= BuildConfig.VERSION_NAME;
    WebView wback;
    ProgressBar p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        p=(ProgressBar)findViewById(R.id.progressBar);
        p.setVisibility(View.INVISIBLE);

        wback=(WebView)findViewById(R.id.update);
        wback.getSettings().setJavaScriptEnabled(true);
        // wback.getSettings().setLoadWithOverviewMode(false);
       /* wback.getSettings().setAllowContentAccess(true);
        wback.getSettings().setAllowFileAccess(true);
        wback.getSettings().setAllowFileAccessFromFileURLs(true);


        // w1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        */wback.getSettings().setAppCacheEnabled(false);

        wback.loadUrl("http://champu.xyz/yb/update"+versionname+".html");



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
        wback.setWebChromeClient(new WebChromeClient() {

            public void onProgressChanged(WebView view, int progress) {
                p.setProgress(progress);


                if (progress == 100) {
                    p.setVisibility(View.GONE);


                }
                else {
                    p.setVisibility(View.VISIBLE);

                }
            }




        });
        new CountDownTimer(20000,2000)
        {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                finish();
            }
        }.start();






    }
}
