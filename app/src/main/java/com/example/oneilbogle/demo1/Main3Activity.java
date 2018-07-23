package com.example.oneilbogle.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {



    public void clickFunction (View view){


        EditText edtName = (EditText) findViewById(R.id.edtName);

        Toast.makeText(Main3Activity.this,"Hi Their " + edtName.getText().toString() , Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
