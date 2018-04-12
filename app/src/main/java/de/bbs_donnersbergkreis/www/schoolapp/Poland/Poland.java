package de.bbs_donnersbergkreis.www.schoolapp.Poland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Poland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poland);
        Button b1 = (Button) findViewById(R.id.button_Location_PL);

        Button b2 = (Button) findViewById(R.id.button_School_info_PL);

        Button b3 = (Button) findViewById(R.id.button_Gallery_PL);

        Button b5 = (Button) findViewById(R.id.button_Disscussion_Blog_PL);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, Pl_map.class);
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
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Poland.this, PL_discuss.class);
                startActivity(intent);
            }
        });
    }
}
