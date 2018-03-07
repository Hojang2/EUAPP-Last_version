package com.example.a1ainfg16.tris;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String[] Pos = {"btn1", "btn2", "btn3", "btn4", "btn5", "btn6", "btn7", "btn8", "btn9"};
    int[] Game = new int[9];
    int P = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OnClick(View view) {
        if (view.getId() == R.id.Restart)
            startActivity(new Intent(this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        else {
            AlertDialog.Builder Notify =new AlertDialog.Builder(this)
                    .setTitle(R.string.Msg_End)
                    .setCancelable(false)
                    .setPositiveButton(R.string.Btn_Play, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent start = new Intent(getApplicationContext(), MainActivity.class);
                            start.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(start);
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            System.exit(0);
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert);

            // Movement(view.getId(),P);
            if (Movement(view.getResources().getResourceEntryName((view.getId())), P)) {
                //((Button) findViewById(view.getId())).setText(Integer.toString(P));
                if (P==1)((Button) findViewById(view.getId())).setBackgroundResource(R.drawable.croce);
                else ((Button) findViewById(view.getId())).setBackgroundResource(R.drawable.cerchio);
                switch (check()){
                    case 0: break;
                    case 1:
                        Notify.setMessage(getString(R.string.win1) + Integer.toString(P) + getString(R.string.win2)).show();
                        break;
                    case 2:
                        Notify.setMessage(R.string.Draw).show();
                        break;



                }
            }
        }
    }


    public boolean Movement(String Btn, int Player) {
        //Log.d("ERROR", Btn);
       // Log.d("ERROR", Integer.toString(Arrays.binarySearch(Pos, Btn)));
        if (Game[Arrays.binarySearch(Pos, Btn)] == 0) {
            Game[Arrays.binarySearch(Pos, Btn)] = Player;
            Switch();
            return true;
        } else {
            Toast.makeText(getBaseContext(), "Casella occupata", Toast.LENGTH_LONG).show();
            return false;
        }

    }

    public void Switch() {
        if (P == 1) P = 2;
        else P = 1;
    }


    public int check() {
        int Tempx[][] = new int[3][3];
                for (int a = 0; a < 9; a++) {
                    Tempx[a / 3][a % 3] = Game[a];
                }

              //  Log.d("this is my array", "arr: " + Arrays.toString(Game));
              //  Log.d("this is my deep array", "deep arr: " + Arrays.deepToString(Tempx));
                int[] O = new int[3];
                int[] V = new int[3];
                int[] D1 = new int[3];
                int[] D2 = new int[3];
                for (int Temp = 0; Temp < 3; Temp++) {
                    for (int Temp2 = 0; Temp2 < 3; Temp2++) {
                        O[Temp2] = Tempx[Temp][Temp2]; //inizializzo array tris orizzontale
                        V[Temp2] = Tempx[Temp2][Temp]; //inizializzo array tris verticale
                        D1[Temp2] = Tempx[Temp2][Temp2]; //inizializzo array diagonale a destra
                        D2[Temp2] = Tempx[Temp2][2 - Temp2]; //inizializzo array diagonale a sinistra
                    }


                    if ((O[0] == O[1] && O[1] == O[2]) && (O[0] != 0))
                        return 1; //controllo orizzontale
                    if ((V[0] == V[1] && V[1] == V[2]) && (V[0] != 0))
                        return 1; //controllo verticale
                    if ((D1[0] == D1[1] && D1[1] == D1[2]) && (D1[0] != 0))
                        return 1; //controllo diagonale a destra
                    if ((D2[0] == D2[1] && D2[1] == D2[2]) && (D2[0] != 0))
                        return 1; //controllo diagonale a sinistra

                }
        int i=0;
            while(i<=Game.length-1){
                if(Game[i]==0)return 0;
                i++;
            }
        return 2;
        }
    }