package com.lintag.christofferjohn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, MyCustomService.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnScreen2){
            i = new Intent(this,Activity2.class);
            startActivity(i);
        } else if(v.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6207,121.0534"));
            chooser = Intent.createChooser(i, "Open with?");
            startActivity(chooser);
        }
    }
}
