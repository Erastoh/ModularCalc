package com.example.modularcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    boolean isNewOp = true;
    String isOp = "+";
    String OldNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch(view.getId()){
            case R.id.bu1:
                number += "1";
                break;
            case R.id.bu2:
                number += "2";
                break;
            case R.id.bu3:
                number += "3";
                break;
            case R.id.bu4:
                number += "4";
                break;
            case R.id.bu5:
                number += "5";
                break;
            case R.id.bu6:
                number += "6";
                break;

            case R.id.bu7:
                number += "7";
                break;
            case R.id.bu8:
                number += "8";
                break;
            case R.id.bu9:
                number += "9";
                break;
            case R.id.bu0:
                number += "0";
                break;
            case R.id.budot:
                number += ".";
                break;
            case R.id.buDivide:
                number += "/";
                break;
            case R.id.buminus:
                number += "-";
                break;
            case R.id.buplusminus:
                number = "-" + number;
                break;
        }
        ed1.setText(number);

    }

    public void operatorEvent(View view) {
        isNewOp = true;
        OldNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.buDivide: isOp = "/";
                break;
            case R.id.buplus: isOp = "+";
                break;
            case R.id.buminus: isOp = "-";
                break;
            case R.id.bumodular: isOp = "%";
                break;
            case R.id.bumultiply: isOp = "*";
                break;
        };
    }

}