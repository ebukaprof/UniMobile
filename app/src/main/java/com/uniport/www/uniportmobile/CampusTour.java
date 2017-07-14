package com.uniport.www.uniportmobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import campusAdapter.CampusTourListAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class CampusTour extends ActionBarActivity {

    ListView campusList;
    String[] locationTitle = { "The University Main Entrance","Admin Building","Senate Building","Department of Computer Science","Faculty of Engineering"};
    String[] tourDetails = { "Praesent sollicitudin vulputate mauris, sodales auctor neque sollicitudin sed. Vestibulum non aliquet l",
            "Praesent sollicitudin vulputate mauris, sodales auctor neque sollicitudin sed. Vestibulum non aliquet lorem, vel vehicula",
            "Praesent sollicitudin vulputate mauris, sodales auctor neque sollicitudin sed. Vestibulum non aliquet lorem, vel vehicula.",
            "Praesent sollicitudin vulputate mauris, sodales auctor neque sollicitudin sed. Vestibulum non aliquet lorem, vel vehicula ",
            "Praesent sollicitudin vulputate mauris, sodales auctor neque sollicitudin sed. Vestibulum non aliquet lorem, vel vehicula "
    };
    int [] thumbnailsImg = {R.drawable.logo2,R.drawable.logo2,R.drawable.logo2,R.drawable.logo2,R.drawable.logo2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campus_tour);

        CampusTourListAdapter campusTourListAdapter = new CampusTourListAdapter(CampusTour.this,locationTitle,tourDetails,thumbnailsImg);

        campusList = (ListView) findViewById(R.id.listViewCampus);
        campusList.setAdapter(campusTourListAdapter);
        campusList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                fullDetails(position);
            }
        });

    }

    private void fullDetails(int position) {
    }
}
