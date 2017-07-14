package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class CodeOfConduct extends ActionBarActivity {

    ListView viewContentConduct;
    String [] stringConduct = {"Academic Staff", "Non Academic Staff","Student"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_of_conduct);

        AllCustomListAdapter listAdapterConduct = new AllCustomListAdapter(CodeOfConduct.this,stringConduct);
        viewContentConduct = (ListView) findViewById(R.id.listViewCode);
        viewContentConduct.setAdapter(listAdapterConduct);
    }
}
