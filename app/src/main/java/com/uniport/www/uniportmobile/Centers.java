package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class Centers extends ActionBarActivity {
    ListView listViewCenters;
    String [] stringCanters = { "University Advancement Center", "Center for Instructional Innovation Technology (CIIT)" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.centers);

        AllCustomListAdapter listAdapterCenters = new AllCustomListAdapter(Centers.this,stringCanters);
        listViewCenters = (ListView) findViewById(R.id.listViewCenters);
        listViewCenters.setAdapter(listAdapterCenters);
    }
}
