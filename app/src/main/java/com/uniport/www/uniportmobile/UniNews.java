package com.uniport.www.uniportmobile;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import customListAdapter.CustomListViewAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class UniNews extends ActionBarActivity {

        ListView listView;

    String[] headlineText = { "End of 2014/2015 Registration Exercise and Orientation ","School of Basic studies 1st Semester Result ","2015 inaugural lecture series ","Students Teaching Practice Posting ","Pre-degree to Degree admission | second Supplementary  ","Pre-Degree Admission 2014/2015 | Education"} ;
    String[] descriptionText= { "Please be informed that the registration of fresh students for the 2014/2015 session has been extended to Friday, 13th March 2015","please be informed that the result for all basic student is out please visit pre degree basic result checking portal",
            "Please note that the 2015 Inaugural Lecture Series of the University of Port Harcourt have been scheduled to hold please visit our centers to verify each event date",
            "The Final list for 2013/2014 Teaching Practice posting is forwarded below. You are to report to the Principal of the school by Tuesday 24th February, 2015.",
            "The following candidate has been offered provisional admission from 2013/2014 Pre-degree programme into the 2014/2015 degree programme as indicated below:l","Visit the department of Education to view all The Entire List"} ;
   //String[] dateText = {"27 feb","27 feb","27 may","27 may","27 may","27 may","27 may" } ;

    int[] newsImg = {R.drawable.logo56,R.drawable.logo56,R.drawable.logo56,R.drawable.logo56,R.drawable.logo56,R.drawable.logo56,R.drawable.logo56};
    //int[] newsMarker = {R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.abc_btn_check_to_on_mtrl_015};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uni_news);

        CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter(UniNews.this,headlineText,descriptionText,newsImg);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customListViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                viewItem(position);
            }
        });
    }

    private void viewItem(int position) {
    }
}
