package com.example.pr3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText number_field_1;
    private EditText number_field_2;
    private Button summa_button;
    private Button product_button;
    private Button devision_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = findViewById(R.id.resultTextView);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_2 = findViewById(R.id.number_field_2);
        summa_button = findViewById(R.id.summa_button);
        product_button = findViewById(R.id.product_button);
        devision_button = findViewById(R.id.devision_button);

        summa_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                resultTextView.setText(String.valueOf(num1 + num2));
            }
        });

        product_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                resultTextView.setText(String.valueOf(num1 * num2));
            }
        });

        devision_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number_field_1.getText().toString());
                float num2 = Float.parseFloat(number_field_2.getText().toString());
                resultTextView.setText(String.valueOf(num1 / num2));
            }
        });
    }
}