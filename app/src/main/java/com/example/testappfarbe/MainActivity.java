package com.example.testappfarbe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button red = (Button) findViewById(R.id.btn_red);
        Button yellow = (Button) findViewById(R.id.btn_yellow);
        Button exit = (Button) findViewById(R.id.btn_exit);
        tv_output = (TextView) findViewById(R.id.tv_output);

        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(), "Sie haben einen Button geklickt", Toast.LENGTH_LONG).show();
        switch(v.getId())
        {
            case R.id.btn_red:
                tv_output.setBackgroundColor(Color.RED);
                break;
            case R.id.btn_yellow:
                tv_output.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.btn_exit:
                finish();
        }
    }
}