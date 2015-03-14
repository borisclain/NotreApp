package biln.notreapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
MainActivity est l'activité principale de l'app. Elle correspond à l'écran d'accueil que
l'utilisateur verra après la première connexion.

Test de commit

 */





public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button buttonSearch;
    Button buttonConsult;



    String title;
    String type;
    String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSearch = (Button)findViewById(R.id.button1);
        buttonConsult = (Button)findViewById(R.id.button2);

        buttonSearch.setOnClickListener(this);
        buttonConsult.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1 :

                Toast.makeText(this, "Clic bien reçu!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;

            case R.id.button2 :
                //TODO Implanter la consultation des événements sauvegardés
                Toast.makeText(this, "Consultation des événements sauvegardés pas encore disponible", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }









}


