package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class SocialScience extends ActionBarActivity {

    ListView viewSocial;

    String [] stringSocial = {"Department of Economic ", "Department of Geography and Environmental Management", "Department of Political and Administrative Studies","Department of Sociology "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social_science);

        AllCustomListAdapter adapterSocial = new AllCustomListAdapter(SocialScience.this,stringSocial);
        viewSocial = (ListView) findViewById(R.id.listViewSocial);
        viewSocial.setAdapter(adapterSocial);

    }


}
