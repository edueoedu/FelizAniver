package com.example.happyb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);

        b.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Feliz Aniversário", Toast.LENGTH_SHORT ).show();
    }
}
