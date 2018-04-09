package de.bbs_donnersbergkreis.www.schoolapp.Germany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Germany_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany_menu);
        Button b1 = (Button) findViewById(R.id.button_Location);

        Button b2 = (Button) findViewById(R.id.button_School_info);

        Button b3 = (Button) findViewById(R.id.button_Gallery);

        Button b4 = (Button) findViewById(R.id.button_Teachers);

        Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog);

        Button b6 = (Button) findViewById(R.id.button_Mini_Games);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_menu.this, Germany_location.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_menu.this, Germany_School_Info.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_menu.this, Germany_Gallery.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_menu.this, Germany_Teachers.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_menu.this, Germany_Discussion_blog.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_menu.this, Germany_Mini_Games.class);
                startActivity(intent);
            }
        });
    }





}
