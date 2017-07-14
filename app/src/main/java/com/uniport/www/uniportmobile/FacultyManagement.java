package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class FacultyManagement extends ActionBarActivity {

    ListView viewManage;

    String [] stringManage = {"Department of Accounting","Department of Management","Department of Finance and Banking","Department of Marketing","Department of Hospitality Tourism",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.management);

        AllCustomListAdapter adaptermanage = new AllCustomListAdapter(FacultyManagement.this,stringManage);
        viewManage = (ListView) findViewById(R.id.listViewManage);
        viewManage.setAdapter(adaptermanage);

    }
}
