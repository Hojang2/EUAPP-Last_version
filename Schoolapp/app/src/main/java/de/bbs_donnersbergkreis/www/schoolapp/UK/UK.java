package de.bbs_donnersbergkreis.www.schoolapp.UK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_Events;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_discussion;
import de.bbs_donnersbergkreis.www.schoolapp.Czech.CZE_meal;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_location;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.PL_Location;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.PL_discuss;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.PL_history;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.PL_list;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.PL_pictures;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.PL_school;
import de.bbs_donnersbergkreis.www.schoolapp.Poland.Poland;
import de.bbs_donnersbergkreis.www.schoolapp.R;

public class UK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);
        Button b1 = (Button) findViewById(R.id.button_Location_UK);

        Button b2 = (Button) findViewById(R.id.button_School_info_UK);

        Button b3 = (Button) findViewById(R.id.button_Gallery_UK);

        Button b4 = (Button) findViewById(R.id.button_Teachers_UK);

        Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog_UK);

        Button b6 = (Button) findViewById(R.id.button_Mini_Games_UK);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UK.this, UK_location.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UK.this, UK_history.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UK.this, UK_pictures.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UK.this, PL_list.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UK.this, UK_discussion.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UK.this, UK_meal.class);
                startActivity(intent);
            }
        });
    }


}
