package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class FacultyEducation extends ActionBarActivity {

    ListView viewEdu;

    String [] stringEdu = {"Department Of Curriculum And Educational Technology ", "Department Of Educational Foundation","Department Of Educational Management",
                            "Department Of Adult and Non Formal Education","Department Of Educational Psychology, guidance and aCounseling","Department Of Adult and Non Formal Education"
                           ,"Department Of Human Kinetic and Health Education"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education);

        AllCustomListAdapter adapterEdu = new AllCustomListAdapter(FacultyEducation.this,stringEdu);
        viewEdu = (ListView) findViewById(R.id.listViewEdu);
        viewEdu.setAdapter(adapterEdu);
    }
}
