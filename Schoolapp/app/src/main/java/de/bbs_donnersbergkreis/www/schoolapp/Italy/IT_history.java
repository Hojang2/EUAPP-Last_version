package de.bbs_donnersbergkreis.www.schoolapp.Italy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.bbs_donnersbergkreis.www.schoolapp.R;

public class IT_history extends AppCompatActivity {
private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_history);
        t=(TextView)findViewById(R.id.itHistoryText);
        t.setText("The Galileo Ferraris is a technical-industrial school founded in 1988 and the name comes" +
                " from an important scientist who invented it.\nOur school has 4 different courses:\n\n" +
                "Informatics (we have subjects like \"Technology and projecting of informatic system\",\"informatic " +
                "system\",\"informatics\" and \"Telecommucation\"); \n\n" +
                "Energy (We have subjects like \"Mechanics\",\"Automation system\",\"mechanical technology of product processing\",\"Energetic plants and drawing & Design\");\n" +
                "\n" +
                "Graphics (We have subjects like \"Comunication theory\",\"multimedial communication\",\"technology of production processes\",\"organization and management of production processes\");\n" +
                "\n" +
                "Electronics (we have subjects like \"electrical engineering and electronics\",\"technology and design of electrical and electronics systems\",\"Automated systems\");\n" +
                "\n" +
                "After five years of education, students gain a diploma in their specialised course - with this diploma they are offered many opportunities in workplaces or further education.  \n" +
                "\n" +
                "Furthermore students are able to take a fifth course which allows them to obtain an additional certifictae. This is a sports course wich is recognised widely by many univeristies and will help the students to stand out as applicant against other students.");
    }
}
