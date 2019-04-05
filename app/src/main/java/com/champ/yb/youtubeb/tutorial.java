package com.champ.yb.youtubeb;

import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class tutorial extends AppCompatActivity {
    ConstraintLayout c;
    ImageView i;
    int in=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        i=(ImageView)findViewById(R.id.imageView2);

        c=(ConstraintLayout)findViewById(R.id.tutorial11);

        c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(in==0)
                {
                    String uri = "@drawable/t2";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    Drawable res = getResources().getDrawable(imageResource);

                    i.setImageDrawable(res);
                    in++;
                }
                else if(in==1)
                {
                    String uri = "@drawable/t3";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    Drawable res = getResources().getDrawable(imageResource);

                    i.setImageDrawable(res);
                    in++;

                }
                else if(in==2)
                {
                    finish();


                }

                return false;
            }
        });




    }
}
