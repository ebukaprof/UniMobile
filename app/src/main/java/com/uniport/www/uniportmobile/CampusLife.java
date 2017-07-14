package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class CampusLife extends ActionBarActivity {
    ListView listViewLife;
    String [] stringLife = {"Staff Unions","Student Affairs Unit","Student Union", "Student Community Services","Student Industrial Work Experience Scheme (SIWES)",
                            "International Student Care","Student Entrepreneurial Center","Student Organisation","Multicultural Activity","Campus Recreation",
                            "Religious Life","Living On Campus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campus_life);

        AllCustomListAdapter listAdapterLife = new AllCustomListAdapter(CampusLife.this,stringLife);
        listViewLife = (ListView) findViewById(R.id.listViewCampusLife);
        listViewLife.setAdapter(listAdapterLife);
    }
}
