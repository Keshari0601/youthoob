package com.champ.yb.youtubeb;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class tnc1 extends AppCompatActivity {
    CheckBox tnccb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnc1);
        WebView view = (WebView) findViewById(R.id.textView3);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "\tYour access to this App is a subject to your acceptance of these terms of service and by your visit to this App you are bound to accord to the terms with full consent. We reserve the Right to change these terms at any time.\n" +
                "<br><br>\t1.\t Our App development Cell respects the Consumer Privacy to its fullest extent and we assure you that none of your personal data will be subjected to leaks or hacks by any external agency but if any accidental leak of consumer data occurs due to, carelessness on Consumer’s part, involvement of any external agency(linked or not linked with us),intended intervention of this App development Cell(owing to unavoidable circumstances whose disclosure is subject to our sheer will),Development Cell shall not be Responsible for any sort of consumer data misuse and We shall not be Accountable to any legal complaint logged by Consumer\n" +
                "<br><br>\t2.\t App development Cell does not guarantee availability of any particular features. A feature  may be a prerelease version and may not work correctly. We reserve the right to change, remove, delete, restrict or block access tool, charge for, stop providing all or any part of App at any time without prior notice.\n" +
                "<br><br>\t3.\t App Development Cell may present additional terms depending upon our evaluation of App performance and Consumer usage and consumer shall be bound to obey it and entire risks of usage and performance remains with Consumer with no accountability of App Development Cell.\n" +
                "<br><br>\t4.\t Notification regarding Updates may or may not be disclosed by App Development Cell depending on App Development Cell’s consent which we won’t be liable to disclose to user or any external authorities (be it legislative, executive, judiciary).\n" +
                "<br><br>\t5.\tApart from this, App usage is sole discretion of user/consumer. We shall not be liable/accountable to any sort of punishment by whatsoever authority, in case of app malfunction, spams, consumer data leaks, intentional/unintentional cyber harm to consumer or any other mishaps that might occur in future due to intentional or unintentional interference by any external authorities or App Development Cell .  \n";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");
        tnccb=(CheckBox)findViewById(R.id.tnccb);
        tnccb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    SQLiteDatabase details=openOrCreateDatabase("details",MODE_PRIVATE,null);
                    details.execSQL("create table if not exists accept (acceptance varchar)");

                    String sa="select * from accept";
                    Cursor ca =details.rawQuery(sa,null);
                    if(ca.getCount()==0)
                    {
                        details.execSQL("insert into accept values('accepted')");



                    }
                    startActivity(new Intent(tnc1.this,Main2Activity.class));
                    finish();
                }

            }
        });



    }
}
