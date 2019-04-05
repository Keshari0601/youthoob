package com.champ.yb.youtubeb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class taskup extends AppCompatActivity {
    WebView wback;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskup);

        wback=(WebView)findViewById(R.id.update);
        wback.getSettings().setJavaScriptEnabled(true);
        // wback.getSettings().setLoadWithOverviewMode(false);
       /* wback.getSettings().setAllowContentAccess(true);
        wback.getSettings().setAllowFileAccess(true);
        wback.getSettings().setAllowFileAccessFromFileURLs(true);


        // w1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        */wback.getSettings().setAppCacheEnabled(false);

        wback.loadUrl("http://champu.xyz/yb/updatetask.html");
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





    }
}
