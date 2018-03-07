package de.bbs_donnersbergkreis.www.schoolapp.Germany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.bbs_donnersbergkreis.www.schoolapp.Italy.Italy;
import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Germany_events extends AppCompatActivity {
    private Button b;
    private Button b2;
    private Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany_events);
        b = (Button) findViewById(R.id.gerEventsButton1);

        b2 = (Button) findViewById(R.id.gerEventsButton1);

        b3 = (Button) findViewById(R.id.gerEventsButton1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_events.this, Germany_event1.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_events.this, Germany_event2.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Germany_events.this, Germany_event3.class);
                startActivity(intent);
            }
        });
    }


}
