package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class HealthScience extends ActionBarActivity {

    ListView listHealth;
    String [] stringsHealth =  {"Faculty of Basic Health","Faculty of Clinical Science","Faculty of Dentistry", "Faculty of pharmaceutical Science"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health);

        AllCustomListAdapter listAdapterHealth = new AllCustomListAdapter(HealthScience.this,stringsHealth);
        listHealth = (ListView)findViewById(R.id.listViewHealth);
        listHealth.setAdapter(listAdapterHealth);
    }
}
