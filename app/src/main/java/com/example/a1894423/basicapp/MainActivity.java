package com.example.a1894423.basicapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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


        final AlertDialog.Builder alertdialog =new AlertDialog.Builder(this);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //alertdialog.setMessage(R.string.app_name);
               alertdialog.setTitle("demo");

                alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String uname,pass;
                        pass=edtpass.getText().toString();
                        uname=edt_name.getText().toString();


                        Intent i= new Intent(MainActivity.this,Dashboard.class);
                        i.putExtra("ed",pass);
                        i.putExtra("un",uname);
                        startActivity(i);


                        Toast.makeText(getApplicationContext(),uname +"Thanks",Toast.LENGTH_LONG).show();


                    }
                });
                alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                      Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();

                    }
                });

                alertdialog.show();

            }
        });


    }
}
