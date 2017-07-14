package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import CollegesandAboutUsCustomlistAdapter.CustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class CollegesFaculties extends ActionBarActivity {

    ListView listViewCollegeFac;
    String [] mainText2 = {"College of Natural And Applied Science","College of Engineering","College of Health Science","Faculty of Agriculture",

               "Faculty of Education","Faculty of Humanities","Faculty of Management","Faculty of Social Science"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colleges_fac);

        CustomListAdapter customListAdapter = new CustomListAdapter (CollegesFaculties.this,mainText2);
        listViewCollegeFac = (ListView) findViewById(R.id.listViewCollege);
        listViewCollegeFac.setAdapter(customListAdapter);
        listViewCollegeFac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                iWouldoThis(position);
            }
        });
    }

    private void iWouldoThis(int listItem) {

        if ( listItem == 0 ){
            Intent appliedScience = new Intent(CollegesFaculties.this,AppliedScience.class);
            startActivity(appliedScience);
        }

        if ( listItem == 1 ){
            Intent engineering = new Intent(CollegesFaculties.this,FalcultyOfEngineering.class);
            startActivity(engineering);
        }

        if ( listItem == 2 ){
            Intent healthScience = new Intent(CollegesFaculties.this,HealthScience.class);
            startActivity(healthScience);
        }

        if ( listItem == 3 ){
            Intent agriculture = new Intent(CollegesFaculties.this,FacultyAgriculture.class);
            startActivity(agriculture);
        }

        if ( listItem == 4 ){
            Intent education = new Intent(CollegesFaculties.this,FacultyEducation.class);
            startActivity(education);
        }
        if ( listItem == 5 ){
            Intent human = new Intent(CollegesFaculties.this,FacultyHumanities.class);
            startActivity(human);
        }
        if ( listItem == 6 ){
            Intent management = new Intent(CollegesFaculties.this,FacultyManagement.class);
            startActivity(management);
        }
        if ( listItem == 7 ){
            Intent socialScience = new Intent(CollegesFaculties.this,SocialScience.class);
            startActivity(socialScience);
        }

    }
}
