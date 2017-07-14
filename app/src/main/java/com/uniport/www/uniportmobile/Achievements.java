package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class Achievements extends ActionBarActivity {

    ListView achievements;
    String [] stringsAchieve = {" Faculty Award","Department Award","Staff Achievements","Student Achievements"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievements);

        AllCustomListAdapter listAdapterAchieve = new AllCustomListAdapter(Achievements.this,stringsAchieve);
        achievements = (ListView) findViewById(R.id.listViewAchieve);
        achievements.setAdapter(listAdapterAchieve);
    }
}
