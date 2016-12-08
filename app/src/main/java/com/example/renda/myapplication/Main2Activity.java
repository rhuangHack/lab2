package com.example.renda.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class Main2Activity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    protected float getFloatNum(){
        int a = Integer.valueOf(10);
        float f = (float) 0.1 * a ;
        f *=  Math.PI / 2.0;
        return (float)Math.sin(f);
    }
}
