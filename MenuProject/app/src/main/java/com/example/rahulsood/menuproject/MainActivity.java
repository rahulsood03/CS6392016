package com.example.rahulsood.menuproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClick(View v)
    {
        if(v.getId() == R.id.button){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + Uri.encode("9179759831")));
        intent.putExtra("sms_body", "Rahul Sood");
        startActivity(intent);
    }

        if(v.getId() == R.id.button2)
        {
            String phno="tel:9179759831";

            Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse(phno));
            startActivity(i);
        }
        if(v.getId() == R.id.button3)
        {
            Uri uri = Uri.parse("http://www.google.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if(v.getId() == R.id.button4)
        {
            String uri = ("geo:30.742313, 76.779115,(My Birth + Place)");
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
            startActivity(intent);

        }
        if(v.getId() == R.id.button5
                )
        {
            Intent intent = new Intent(Intent.ACTION_CHOOSER);
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "Share the love!"));
        }

        if(v.getId()==R.id.button6)
        {
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }
    public void MessageBox(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast t = Toast.makeText(this, "Settings", Toast.LENGTH_SHORT);
            t.show();
            return true;
        } else if (id == R.id.action_help) {
            Intent intent = new Intent( "com.matthewell.intentHelp" );
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
