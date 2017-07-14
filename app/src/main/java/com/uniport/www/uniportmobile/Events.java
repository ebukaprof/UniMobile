package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import custom_nails_all.ThumbNailsAdapter;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class Events extends ActionBarActivity{

    private ListView listViewThumbnails2;
    private String [] libHeaTex2 = {" Uniport At 40", " 117TH INAUGURAL LECTURE ","APPLICATION FOR ADMISSION "};
    private String [] libSubTex2 = {
            "Children Art workshop and Exhibition and the Theme is The Expression ",
            "The State And The Culture of Terrorism in Nigeria: Unveiling The Real Terrorists ",
            "Applications are invited from suitably qualified candidates for admission the Certificate Programmes "};
    private int [] thumbsImg2 = {R.drawable.event,R.drawable.logo56,R.drawable.logo56};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);

        listViewThumbnails2 = (ListView) findViewById(R.id.listViewEvent);
        ThumbNailsAdapter nailsAdapter = new ThumbNailsAdapter(Events.this,libHeaTex2,libSubTex2,thumbsImg2);
        listViewThumbnails2.setAdapter(nailsAdapter);
        listViewThumbnails2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                movetolib(position);
            }
        });
    }

    private void movetolib(int libb) {

        if(libb == 0){
           // Intent inaugral = new Intent(Events.this,UniportAt40.class);
           // startActivity(inaugral);
            Toast.makeText(Events.this, " No details Avaliable",Toast.LENGTH_LONG).show();
        }

        if(libb == 1){
           // Intent at40 = new Intent(Events.this,InaugralLecture.class);
           // startActivity(at40);
            Toast.makeText(Events.this, " No details Avaliable",Toast.LENGTH_LONG).show();
        }

        if(libb == 2){
            //Intent intentlib = new Intent(Events.this,LibraryDetails.class);
           // startActivity(intentlib);
             Toast.makeText(Events.this, " No details Avaliable",Toast.LENGTH_LONG).show();
        }
/*
        if(libb == 3){
            Intent intentlib = new Intent(Events.this,LibraryDetails.class);
            startActivity(intentlib);
        }

        if(libb == 4){
            Intent intentlib = new Intent(Events.this,LibraryDetails.class);
            startActivity(intentlib);
        }*/

    }
}
