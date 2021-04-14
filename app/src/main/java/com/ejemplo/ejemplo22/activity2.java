package com.ejemplo.ejemplo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_activity2);
        //
        getSupportActionBar().hide();
        Toast.makeText (getApplicationContext (),"Bienvenido",Toast.LENGTH_LONG).show ();
    }
}