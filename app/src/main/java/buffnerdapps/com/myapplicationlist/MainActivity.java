package buffnerdapps.com.myapplicationlist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    Allows the buttons within the menu to activate a toast message once pressed
     */
    public void sendMessage(View view) {
        final Button buttonCap = (Button) findViewById(R.id.capstoneButton);
        final Button buttonSpot = (Button) findViewById(R.id.spotifyButton);
        final Button buttonScor = (Button) findViewById(R.id.scoreButton);
        final Button buttonLib = (Button) findViewById(R.id.libraryButton);
        final Button buttonXyz = (Button) findViewById(R.id.baconButton);
        final Button buttonBuild = (Button) findViewById(R.id.buildButton);

        Context context = getApplicationContext();
        CharSequence cap = "This button will launch my capstone app!";
        CharSequence spot = "This button will launch my Spotify Streamer app!";
        CharSequence scor = "This button will launch my Scores app!";
        CharSequence lib = " This button will launch my Library app!";
        CharSequence read = "This button will launch my XYZ Reader app!";
        CharSequence build = "This button will launch my Build it Bigger app!";

        int duration = Toast.LENGTH_SHORT;

        if (view.equals(buttonCap) ) {
            Toast toast = Toast.makeText(context, cap, duration);
            toast.show();
        }
        else if (view.equals(buttonSpot)){
            Toast toast = Toast.makeText(context, spot, duration);
            toast.show();
        }
        else if (view.equals(buttonScor)){
            Toast toast = Toast.makeText(context, scor, duration);
            toast.show();
        }
        else if (view.equals(buttonLib)){
            Toast toast = Toast.makeText(context, lib, duration);
            toast.show();
        }
        else if (view.equals(buttonXyz)){
            Toast toast = Toast.makeText(context, read, duration);
            toast.show();
        }
        else if (view.equals(buttonBuild)){
            Toast toast = Toast.makeText(context, build, duration);
            toast.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
