package com.champ.yb.youtubeb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Blog extends AppCompatActivity {
    WebView blog;
    ProgressBar p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        blog = (WebView) findViewById(R.id.blog);
        p=(ProgressBar)findViewById(R.id.progressBar);
        p.setVisibility(View.INVISIBLE);
        blog.setWebViewClient(new WebViewClient());
        blog.getSettings().setJavaScriptEnabled(true);
        // wback.getSettings().setLoadWithOverviewMode(false);
        // w1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        blog.getSettings().setAppCacheEnabled(false);

        blog.getSettings().setBuiltInZoomControls(true);
        blog.getSettings().setDisplayZoomControls(false);

        blog.loadUrl("http://champu.xyz/yb/blog.html");


        blog.setWebViewClient(new WebViewClient() {
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
        blog.setWebChromeClient(new WebChromeClient() {

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

    }

    @Override
    public void onBackPressed() {

        if(blog.canGoBack())
        {
            blog.goBack();
        }
        else {

            super.onBackPressed();
        }


    }
}
