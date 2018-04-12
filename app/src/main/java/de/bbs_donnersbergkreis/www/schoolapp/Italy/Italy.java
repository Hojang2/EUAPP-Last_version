package de.bbs_donnersbergkreis.www.schoolapp.Italy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.R;



public class Italy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);
        Button b1 = (Button) findViewById(R.id.button_Location_IT);

        Button b2 = (Button) findViewById(R.id.button_School_info_IT);

        Button b3 = (Button) findViewById(R.id.button_Gallery_IT);

        Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog_IT);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_map.class);
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

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Italy.this, IT_discuss.class);
                startActivity(intent);
            }
        });
    }

    public void btn_history(View view) {
        Intent intent = new Intent(this, IT_history.class);
        startActivity(intent);

    }

    public void btn_pictures(View view) {
        Intent intent = new Intent(this,IT_pictures.class);
        startActivity(intent);


    }
    public void btn_discuss(View view) {
        Intent intent = new Intent(this, IT_discuss.class);
        startActivity(intent);
    }
}
