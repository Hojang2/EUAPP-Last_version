package de.bbs_donnersbergkreis.www.schoolapp.Czech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Czech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_czech);

    Button b1 = (Button) findViewById(R.id.button_Location_CZE);

    Button b2 = (Button) findViewById(R.id.button_School_info_CZE);

    Button b3 = (Button) findViewById(R.id.button_Gallery_CZE);

    Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog_CZE);

    Button b6 = (Button) findViewById(R.id.button_Mini_Games_CZE);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Czech.this, czech_map.class);
            startActivity(intent);
        }
    });
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Czech.this, History_school.class);
            startActivity(intent);
        }
    });
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Czech.this, CZE_Pictures.class);
            startActivity(intent);
        }
    });
    b5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Czech.this, CZE_discussion.class);
            startActivity(intent);
        }
    });
    b6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Czech.this, CZE_meal.class);
            startActivity(intent);
        }
    });
}}

