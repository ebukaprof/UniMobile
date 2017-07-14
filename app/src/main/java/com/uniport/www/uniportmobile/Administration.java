package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/16/2015.
 */
public class Administration extends ActionBarActivity {
    ListView viewAdmin;
    String[] admins = {"Office oF The Vice Chancellor ", "Office oF The Deputy Vice Chancellor ", "Office oF The Deputy Vice Chancellor (Academic)","Office oF The Deputy Vice Chancellor (Research and Development) ", "Principal Officers "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminstration);

        AllCustomListAdapter adapter = new AllCustomListAdapter(Administration.this,admins);
        viewAdmin = (ListView) findViewById(R.id.listViewAdmin);
        viewAdmin.setAdapter(adapter);
    }
}
