package com.uniport.www.uniportmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by INNOVATIONIST-PC on 3/13/2015.
 */
public class Login extends Activity {


    Button buttonLogin;
    Button buttonCancel;

    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

            buttonLogin = (Button) findViewById(R.id.buttonLogin);
            buttonLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Login.this,MainActivity.class);
                    finish();
                    startActivity(i);


                }
            });

            buttonCancel = (Button) findViewById(R.id.buttonCancel);
            buttonCancel.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(Login.this, "Thank You..", Toast.LENGTH_LONG).show();

                    finish();
                    System.exit(0);

                }
            });



        }
}
