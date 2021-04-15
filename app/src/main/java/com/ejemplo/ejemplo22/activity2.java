package com.ejemplo.ejemplo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    TextView txtName,txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_activity2);
        //
        getSupportActionBar().hide();


        txtName = (TextView)findViewById (R.id.textView);
        txtPass = (TextView)findViewById (R.id.textView2);

        txtName.setText("Nombre: "+getIntent ().getStringExtra ("name"));
        txtPass.setText("contraseña: "+getIntent ().getStringExtra ("pass"));
    }
}