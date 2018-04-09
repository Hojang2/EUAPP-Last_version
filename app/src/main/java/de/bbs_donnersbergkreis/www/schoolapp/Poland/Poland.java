package de.bbs_donnersbergkreis.www.schoolapp.Poland;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_Pictures;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_discussion;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_meal;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.Czech;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.Czech_Location;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.History_school;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.List_CZE;
import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Poland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poland);
        Button b1 = (Button) findViewById(R.id.button_Location_PL);

        Button b2 = (Button) findViewById(R.id.button_School_info_PL);

        Button b3 = (Button) findViewById(R.id.button_Gallery_PL);

        Button b4 = (Button) findViewById(R.id.button_Teachers_PL);

        Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog_PL);

        Button b6 = (Button) findViewById(R.id.button_Mini_Games_PL);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_Location.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_history.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_pictures.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_list.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_discuss.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_school.class);
                startActivity(intent);
            }
        });
    }


        

}
