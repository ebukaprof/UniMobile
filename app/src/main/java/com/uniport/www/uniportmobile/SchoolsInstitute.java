package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class SchoolsInstitute extends ActionBarActivity {

    ListView listViewSchools;
    String [] stringsSchools = {"Schools","Institute"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schools_institute);

        AllCustomListAdapter listAdapterSchools = new AllCustomListAdapter(SchoolsInstitute.this,stringsSchools);
        listViewSchools = (ListView) findViewById(R.id.listViewSchoolInstitute);
        listViewSchools.setAdapter(listAdapterSchools);

    }
}
