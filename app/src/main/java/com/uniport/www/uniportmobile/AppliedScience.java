package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class AppliedScience extends ActionBarActivity {

    ListView listView;

    String [] appliedScience = {"Faculty Of Biological Science", "Faculty Of Chemical Science", "Faculty Of Physical Science"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appliedsciences);
        AllCustomListAdapter allCustomListAdapter2 = new AllCustomListAdapter(AppliedScience.this,appliedScience);
        listView = (ListView) findViewById(R.id.listViewApplied);
        listView.setAdapter(allCustomListAdapter2);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectYours(position);
            }
        });

    }

    private void selectYours(int position) {



    }
}
