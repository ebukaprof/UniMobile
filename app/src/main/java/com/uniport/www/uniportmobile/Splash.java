package com.uniport.www.uniportmobile;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by INNOVATIONIST-PC on 3/13/2015.
 */
public class Splash extends Activity {

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        progressDialog = new ProgressDialog(this);

        Thread timer = new Thread() {
            public void run() {

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent loginScreen = new Intent(Splash.this,MainActivity.class);
                    finish();
                    startActivity(loginScreen);
                }
            }
        };

        timer.start();
    }
}