package com.ejemplo.ejemplo22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        //
        getSupportActionBar().hide();
        this.iniciar = findViewById (R.id.button);
        this.iniciar.setOnClickListener (this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId ()==R.id.button)
        {
            startActivity (new Intent (this,activity2.class));
        }
    }
}