package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import gridAdapter.CustomGridAdapter;


public class MainActivity extends ActionBarActivity {
    GridView gridView;
    String [] menuItem = {
            "Pay Fees",
            "Directory",
            "Events",
            "Student Services",
            "Uni News",
            "Campus Chat",
            "Colleges & Faculties",
            "Campus Tour",
            "About Uni",
            "Close App"   };

    int [] imageId = {
            R.drawable.money,
            R.drawable.dept,
            R.drawable.doc,
            R.drawable.tools,
            R.drawable.pricetags,
            R.drawable.chat,
            R.drawable.timetable,
            R.drawable.book,
            R.drawable.logo56,
            R.drawable.lock

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomGridAdapter customGridAdapter = new CustomGridAdapter(MainActivity.this,menuItem,imageId);
        gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                GoHere(position);

            }
        });

    }

    private void GoHere(int item) {

        if (item == 9 ){
            finish();
            System.exit(0);
        }
        if(item == 0){
            Intent feesPay = new Intent(MainActivity.this,Fees.class);
            startActivity(feesPay);

        }

        if(item == 1){
            Intent timeTable = new Intent(MainActivity.this,Directory.class);
            startActivity(timeTable);

        }

        if(item == 2){
            Intent results = new Intent(MainActivity.this,Events.class);
            startActivity(results);

        }

        if(item == 3){
            Intent assignment = new Intent(MainActivity.this,StudentServices.class);
            startActivity(assignment);

        }

        if(item == 4){
            Intent uniNews = new Intent(MainActivity.this,UniNews.class);
            startActivity(uniNews);

        }

        if(item == 5){
            Toast.makeText(this,"this feature has not be implemented yet",Toast.LENGTH_LONG).show();
            //Intent forum = new Intent(MainActivity.this,Forum.class);
            //startActivity(forum);

        }

        if(item == 6){
            Intent course = new Intent(MainActivity.this,CollegesFaculties.class);
            startActivity(course);

        }

        if(item == 7){
            Intent updateProfile = new Intent(MainActivity.this,CampusTour.class);
            startActivity(updateProfile);

        }

        if(item == 8){

            //Toast.makeText(this,"this feature has not be implemented yet",Toast.LENGTH_LONG).show();
            Intent aboutUni = new Intent(MainActivity.this,AboutUni.class);
           startActivity(aboutUni);

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
