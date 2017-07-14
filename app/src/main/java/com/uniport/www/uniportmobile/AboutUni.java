package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import GneralCustomAdapter.AllCustomListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class AboutUni extends ActionBarActivity {

    ListView listViewAbout;

    String [] aboutUniMenu ={"Our Location", "Administration", "History Of The University", "Achievement",
            "Campus Life","School & Institute","Centers","Code of Conduct"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_uni);

        AllCustomListAdapter allCustomListAdapter = new AllCustomListAdapter(AboutUni.this , aboutUniMenu);
        listViewAbout = (ListView) findViewById(R.id.listViewAbout);
        listViewAbout.setAdapter(allCustomListAdapter);
        listViewAbout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                quickMovement(position);
            }
        });

    }

    private void quickMovement(int itemAbout) {

        if (itemAbout == 0){
            Toast.makeText(AboutUni.this,"View Gallery to See Location",Toast.LENGTH_LONG).show();
          //  Intent tata = new Intent(AboutUni.this,rat.class);
        }
        if (itemAbout == 1){
            Intent dministration = new Intent(AboutUni.this,Administration.class);
            startActivity(dministration);
        }

        if (itemAbout == 2){
            Intent history101 = new Intent(AboutUni.this,HistoryOfUni.class);
            startActivity(history101);
        }

        if (itemAbout == 3){
            Intent achievements1 = new Intent(AboutUni.this,Achievements.class);
            startActivity(achievements1);
        }

        if (itemAbout == 4){
            Intent campusLife = new Intent(AboutUni.this,CampusLife.class);
            startActivity(campusLife);
        }

        if (itemAbout == 5){
            Intent schools1 = new Intent(AboutUni.this,SchoolsInstitute.class);
            startActivity(schools1);
        }

        if (itemAbout == 6){
            Intent centers1 = new Intent(AboutUni.this,Centers.class);
            startActivity(centers1);
        }

        if (itemAbout == 7){
            Intent codeConduct = new Intent(AboutUni.this,CodeOfConduct.class);
            startActivity(codeConduct);
        }



    }
}
