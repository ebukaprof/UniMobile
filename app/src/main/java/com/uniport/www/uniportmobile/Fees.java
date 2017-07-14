package com.uniport.www.uniportmobile;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class Fees extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fees);

        Button button = (Button) findViewById(R.id.pay);

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Fees.this,"This Feature has not been implemented yet",Toast.LENGTH_LONG).show();
            }
        });
    }
}
