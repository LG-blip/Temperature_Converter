package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    public void  onClickButton(View view) {
        Log.i("Button", "Pressed the Button");
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        String value = editTextNumber.getText().toString();
        double res = (float)Integer.parseInt(value) * 1.8 + 32;
        Snackbar.make(view, "The value is " + res + " Fahrenheit", Snackbar.LENGTH_SHORT).show();
    }

    public void onClickValueButton(View view){
        Log.i("Value Button", "Pressed the value button");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_TemperatureConverter);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
    }
}