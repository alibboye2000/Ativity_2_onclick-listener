package com.example.activity_2;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText edemail, edpassword;
    String nama, password;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btsignIn);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edemail.getText().toString();
                password = edpassword.getText().toString();


                Toast t = Toast.makeText(getApplicationContext(),
                        nama= "email anda: " + nama + " dan password anda: " + password+"", Toast.LENGTH_LONG);

                t.show();

            }
        });
    }
}

