package com.stephen.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BasicMathOps extends AppCompatActivity {

    private EditText et_first_number, et_second_number;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_math_ops);
        et_first_number = findViewById(R.id.et_first_number_text);
        et_second_number = findViewById(R.id.et_second_number_text);
        tv_result = findViewById(R.id.tv_result);
    }//onCreate

    public void sum(View view){
    int first_number = Integer.parseInt(et_first_number.getText().toString());
    int second_number = Integer.parseInt(et_second_number.getText().toString());
    int result = (first_number + second_number);
    tv_result.setText(String.valueOf(result));

    }//sum

    public void substract(View view){
        int first_number = Integer.parseInt(et_first_number.getText().toString());
        int second_number = Integer.parseInt(et_second_number.getText().toString());
        int result = (first_number - second_number);
        tv_result.setText(String.valueOf(result));

    }//substract

    public void product(View view){
        int first_number = Integer.parseInt(et_first_number.getText().toString());
        int second_number = Integer.parseInt(et_second_number.getText().toString());
        int result = (first_number * second_number);
        tv_result.setText(String.valueOf(result));

    }//product

    public void division(View view){
        int first_number = Integer.parseInt(et_first_number.getText().toString());
        int second_number = Integer.parseInt(et_second_number.getText().toString());
        if(second_number != 0) {
            int result = (first_number / second_number);
            tv_result.setText(String.valueOf(result));
        } else {
            tv_result.setText("Error");
        }
    }//division

    public void clearInputs(View view){
        et_first_number.getText().clear();
        et_second_number.getText().clear();
        tv_result.setText("Resultado");
    }


}//class