package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class FalcultyOfEngineering extends ActionBarActivity {
    ListView engineer;
    String[] stringEngine = {"Faculty Of Process and Energy System Engineering", "Faculty Of Infrastructure System Engineering", "Faculty Of Production Power System and Communication Engineering"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falculty_of_engineering);

        AllCustomListAdapter listAdapterFaculty = new AllCustomListAdapter(FalcultyOfEngineering.this,stringEngine);
        engineer = (ListView) findViewById(R.id.listViewEngine);
        engineer.setAdapter(listAdapterFaculty);
    }
}
