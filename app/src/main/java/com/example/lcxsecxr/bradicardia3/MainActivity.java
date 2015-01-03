package com.example.lcxsecxr.bradicardia3;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends Activity {

    TabHost th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/**
        th = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec spec = th.newTabSpec("Tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Analisis");
        th.addTab(spec);

        TabHost.TabSpec spec2 = th.newTabSpec("Tab2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("History");
        th.addTab(spec2);

        TabHost.TabSpec spec3 = th.newTabSpec("Tab3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("Opciones");
        th.addTab(spec3);
**/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
