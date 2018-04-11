package de.bbs_donnersbergkreis.www.schoolapp.Germany;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import de.bbs_donnersbergkreis.www.schoolapp.Czech.JSONObjectRequestWrapper;
        import de.bbs_donnersbergkreis.www.schoolapp.R;

        import static de.bbs_donnersbergkreis.www.schoolapp.R.string.germ_info1;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.widget.TextView;

        import com.android.volley.Response;
        import com.android.volley.VolleyError;

        import org.json.JSONException;
        import org.json.JSONObject;

        import de.bbs_donnersbergkreis.www.schoolapp.R;


public class Germany_School_Info extends AppCompatActivity {

    TextView view;
    String theStringYouEncoded;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany__history_of_school);

        try {
            new JSONObjectRequestWrapper(this)
                    .create("RedTeam", "test2")
                    .add("id", "DEU")
                    .send(listener, fail);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        view=(TextView)findViewById(R.id.germany_history_id);
    }




    private Response.Listener<JSONObject> listener = new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            Log.w("AAAA", response.toString());
            try {
                theStringYouEncoded = response.getString( "text" );
            } catch (JSONException e) {
                e.printStackTrace();
            }
            view.setText(theStringYouEncoded);
        }
    };

    private Response.ErrorListener fail = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.v("Faild to send message", error.getMessage());

        }
    };
}