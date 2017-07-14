package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class AcademicCalendar extends ActionBarActivity {

    ListView listViewacada;
    String [] year = {" APPROVED ACADEMIC CALENDAR FOR  FIRST SEMESTER 2014/2015 SESSION FOR REGULAR  PROGRAMMES",
                     "  AMENDED ACADEMIC CALENDAR FOR  SECOND SEMESTER,2013/2014 SESSION FOR REGULAR  PROGRAMMES",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.academic_calendar);

        AllCustomListAdapter listAdapter = new AllCustomListAdapter(AcademicCalendar.this,year);
        listViewacada = (ListView) findViewById(R.id.listViewCalendar);
        listViewacada.setAdapter(listAdapter);
        listViewacada.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 firsorsecond(position);

            }
        });
    }

    private void firsorsecond(int first) {

        if (first == 0){
            Intent firstCalendar = new Intent(AcademicCalendar.this,FirstSemester.class);
            startActivity(firstCalendar);

        }

        if (first == 1){
            Intent secondCalendar = new Intent( AcademicCalendar.this, SecondSemester.class);
            startActivity(secondCalendar);

        }
    }
}
