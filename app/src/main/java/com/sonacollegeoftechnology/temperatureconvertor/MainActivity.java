package com.sonacollegeoftechnology.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton f2c,c2f;
    EditText temperature;
    Button convert;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f2c = findViewById(R.id.f2c);
        c2f = findViewById(R.id.c2f);

        result = findViewById(R.id.textView);

        temperature = findViewById(R.id.temperature);
        convert = findViewById(R.id.convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(f2c.isChecked()){
                    Double t = (Float.parseFloat(temperature.getText().toString()) - 32) * (5/9.0);
                    result.setText(t.toString()+" Celcius");
                }
                else if(c2f.isChecked()){
                    Double t = (Float.parseFloat(temperature.getText().toString()) * (9/5.0)) + 32;
                    result.setText(t.toString()+" Farenheit");
                }
            }
        });

    }
}
