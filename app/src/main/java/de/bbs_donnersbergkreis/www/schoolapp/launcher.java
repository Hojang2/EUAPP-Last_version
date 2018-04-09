package de.bbs_donnersbergkreis.www.schoolapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class launcher extends AppCompatActivity {
    private Handler h=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);


        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(launcher.this, MainActivity.class);
                startActivity(i);
            }
        }, 3000);
    }
}
