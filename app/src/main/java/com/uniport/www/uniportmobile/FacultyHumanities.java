package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class FacultyHumanities extends ActionBarActivity {

    ListView viewHuman;

    String [] stringHuman = {"Department of Music", "Department of English Studies", "Department of English Studies","Department of Foreign Language and Literature",
            "Department of Ling and Comm Studies","Department of Rel And Cultural Studies","Department of Fine Art and Design",
            "Department of History and Diplomatic Studies","Department of Philosophy","Department of Theater Arts",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.humanities);

        AllCustomListAdapter adapterHuman = new AllCustomListAdapter(FacultyHumanities.this,stringHuman);
        viewHuman = (ListView) findViewById(R.id.listViewHuman);
        viewHuman.setAdapter(adapterHuman);

    }
}
