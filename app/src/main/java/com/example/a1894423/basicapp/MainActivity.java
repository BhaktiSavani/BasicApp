package com.example.a1894423.basicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edt_name,edtpass;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtpass =findViewById(R.id.edt_pass);
        edt_name=findViewById(R.id.edt_name);
        btnsubmit=findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname,pass;
                pass=edtpass.getText().toString();
                uname=edt_name.getText().toString();


                Intent i= new Intent(MainActivity.this,Dashboard.class);
                i.putExtra("ed",pass);
                i.putExtra("un",uname);
                startActivity(i);


                Toast.makeText(getApplicationContext(),edt_name +"Thanks",Toast.LENGTH_LONG).show();

            }
        });


    }
}
