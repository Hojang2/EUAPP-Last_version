package de.bbs_donnersbergkreis.www.schoolapp.Italy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_Discussion_blog;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_Gallery;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_Mini_Games;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_School_Info;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_Teachers;
import de.bbs_donnersbergkreis.www.schoolapp.Germany.Germany_location;
import de.bbs_donnersbergkreis.www.schoolapp.R;



public class Italy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);
        Button b1 = (Button) findViewById(R.id.button_Location_IT);

        Button b2 = (Button) findViewById(R.id.button_School_info_IT);

        Button b3 = (Button) findViewById(R.id.button_Gallery_IT);

        Button b4 = (Button) findViewById(R.id.button_Teachers_IT);

        Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog_IT);

        Button b6 = (Button) findViewById(R.id.button_Mini_Games_IT);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_location.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_history.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_pictures.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_list.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_discuss.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_Meal.class);
                startActivity(intent);
            }
        });


    }


    public void button_Location_it(View view) {
        Intent intent = new Intent(this, IT_location.class);
        startActivity(intent);
    }

    public void btn_history(View view) {
        Intent intent = new Intent(this, IT_history.class);
        startActivity(intent);

    }

    public void btn_pictures(View view) {
        Intent intent = new Intent(this,IT_pictures.class);
        startActivity(intent);


    }

    public void btn_list(View view) {
        Intent intent = new Intent(this, IT_list.class);
        startActivity(intent);
    }

    public void btn_discuss(View view) {
        Intent intent = new Intent(this, IT_discuss.class);
        startActivity(intent);
    }

    public void btn_meal(View view) {
        Intent intent = new Intent(this, IT_Meal.class);
        startActivity(intent);
    }

    public void btn_events(View view) {
        Intent intent = new Intent(this, IT_events.class);
        startActivity(intent);
    }
}
