package com.lintag.christofferjohn;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.act1){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        } else if(v.getId()==R.id.map2){
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5321,120.9838"));
            chooser = Intent.createChooser(i, "Open with?");
            startActivity(chooser);
        }
    }
}
