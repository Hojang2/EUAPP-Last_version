package com.example.a1ainfg16.tris;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
int click = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.Solo:
            startActivity(new Intent(this,MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

            break;
            case R.id.Multi:
                startActivity(new Intent(this,matchmaking.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));


            break;

            case R.id.Esci:
                super.finish();
                break;

            case R.id.Immagine:
                if(click<7){
                click++;
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        click = 0;
                    }
                }, 2000);
            }else Toast.makeText(this,"Made by Alberto Spaziano",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
