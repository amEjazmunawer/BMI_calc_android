package com.hfad.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();

    }

    public void myButtonListenerMethod() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText wt = (EditText) findViewById(R.id.editTextWeight);
                EditText ht = (EditText) findViewById(R.id.editTextHeight);
                Double weight = Double.parseDouble( wt.getText().toString());
                Double height = Double.parseDouble( ht.getText().toString());





            }});
    }

}
