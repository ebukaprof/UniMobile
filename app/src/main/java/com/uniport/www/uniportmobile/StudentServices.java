package com.uniport.www.uniportmobile;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import customGridAll.CustomGridAllToday;


/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class StudentServices extends ActionBarActivity {
    GridView gridView;
    String[] studentServiceMenu = { "Academic Calender","Under Graduate", "Post Graduate", "Registration",
            "Post UTME", "Certificate", " Basic", "Access Control", "Library" };
    int[] imageIdC = {
            R.drawable.calendart,
            R.drawable.undergraduate2,
            R.drawable.graduate2,
            R.drawable.register,
            R.drawable.postume,
            R.drawable.certificate,
            R.drawable.basic,
            R.drawable.access_control,
            R.drawable.library

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_services);

        CustomGridAllToday customGridAllToday = new CustomGridAllToday(StudentServices.this, studentServiceMenu, imageIdC);
        gridView = (GridView) findViewById(R.id.gridStudentServices);
        gridView.setAdapter(customGridAllToday);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                clickMe(position);
            }
        });
    }

    private void clickMe(int item32) {

        if (item32 == 0){
            Intent academic = new Intent(StudentServices.this,AcademicCalendar.class);
            startActivity(academic);
        }

        if (item32 == 1) {

            Toast.makeText(StudentServices.this, "You are not allowed to perform the operation", Toast.LENGTH_LONG).show();

        }
        if (item32 == 2) {

            Toast.makeText(StudentServices.this, "this operation is not available at this moment", Toast.LENGTH_LONG).show();

        }
        if (item32 == 3) {

            Toast.makeText(StudentServices.this, "Please Login to register", Toast.LENGTH_LONG).show();

        }
        if (item32 == 4) {

            Toast.makeText(StudentServices.this, "this operation is not available at this moment", Toast.LENGTH_LONG).show();

        }
        if (item32 == 5) {

            Toast.makeText(StudentServices.this, "this operation is not available at this moment", Toast.LENGTH_LONG).show();

        }
        if (item32 == 6) {

            Toast.makeText(StudentServices.this, "this operation is not available at this moment", Toast.LENGTH_LONG).show();

        }
        if (item32 == 7) {

            Intent intent = new Intent(StudentServices.this, Login.class);
            startActivity(intent);

        }
        if (item32 == 8) {

            Intent intent2 = new Intent(StudentServices.this, Library.class);
            startActivity(intent2);


        }
    }
}