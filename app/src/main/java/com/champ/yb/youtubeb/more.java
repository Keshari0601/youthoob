package com.champ.yb.youtubeb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class more extends AppCompatActivity {
    TextView tnc,tutorial,update,blog,features;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        tnc=(TextView)findViewById(R.id.tnc);
        tutorial=(TextView)findViewById(R.id.tutorial);
        update=(TextView)findViewById(R.id.update);
        blog =(TextView)findViewById(R.id.Blog);
        features =(TextView)findViewById(R.id.Features);
        features.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(more.this,features.class));
            }
        });

        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(more.this,tnc.class));
            }
        });
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(more.this,tutorial.class));

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(more.this,update.class));
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(more.this,Blog.class));
            }
        });



    }
    public void Clicked(View view) {
       /* ACTION_SEND: Deliver some data to someone else.
        createChooser (Intent target, CharSequence title): Here, target- The Intent that the user will be selecting an activity to perform.
            title- Optional title that will be displayed in the chooser.
        Intent.EXTRA_TEXT: A constant CharSequence that is associated with the Intent, used with ACTION_SEND to supply the literal data to be sent.
        */
      //  ProgressBar p=new ProgressBar(this);
       // p.setVisibility(View.VISIBLE);
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,"Ever played YouTube in background??\nEver live streamed an audio in the most unconventional and whimsical manner. Just give YouThoob a try!\nhttp://champu.xyz/yb/download.html");
        sendIntent.setType("text/plain");
        Intent.createChooser(sendIntent, "Share via");
        startActivity(sendIntent);
        //p.setVisibility(View.INVISIBLE);
    }
}
