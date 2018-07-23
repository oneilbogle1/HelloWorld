package com.example.oneilbogle.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {



    public void buttonClick (View view){



        EditText nameText = (EditText) findViewById(R.id.editText);
        EditText passwordText = (EditText) findViewById(R.id.editText2);





        Log.i("Log",nameText.getText().toString() + passwordText.getText().toString());


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
