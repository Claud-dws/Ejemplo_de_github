package com.ejemplo.ejemplo22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button iniciar;
    private EditText txtName,txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        //
        getSupportActionBar().hide();
        this.iniciar = findViewById (R.id.button);
        this.iniciar.setOnClickListener (this);

        txtName = (EditText)findViewById (R.id.txtName);
        this.txtPass = (EditText)findViewById (R.id.TxtPass);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId ()==R.id.button)
        {
            Intent intent = new Intent (this,activity2.class);
            //
            intent.putExtra ("name",this.txtName.getText ().toString ());
            intent.putExtra ("pass",this.txtPass.getText ().toString ());
            //
            startActivity (intent);
        }
    }
}