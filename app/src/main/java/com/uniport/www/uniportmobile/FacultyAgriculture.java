package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class FacultyAgriculture extends ActionBarActivity {

    ListView listViewAgric ;
    String [] stringsAgric = {"Department Of Crop and Soil Science", "Department Of Animal Science And Fishery","Department Of Agric, Econs and Extentions",
            "Department Of Forestry And Wild Life Management",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facultyofagriculture);

        AllCustomListAdapter adapterAgric = new AllCustomListAdapter(FacultyAgriculture.this,stringsAgric);
        listViewAgric = (ListView) findViewById(R.id.listViewAgric);
        listViewAgric.setAdapter(adapterAgric);


    }


}
