package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textview1, textview2;
    private double first, second, result;
    private String operation, answer;
    private Button btn0,  btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnBackspace, btnDivide, btnMultiply, btnMinus, btnPlus, btnPercent, btnDot, btnEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1 = findViewById(R.id.Textview1);
        textview2 = findViewById(R.id.Textview2);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnClear = findViewById(R.id.btnClear);
        btnBackspace = findViewById(R.id.btnBackspace);
        btnPercent = findViewById(R.id.btnPercent);
        btnPlus = findViewById(R.id.btnPlus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText(null);
                textview2.setText(null);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn0.getText().toString();
                textview2.setText(text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn1.getText().toString();
                textview2.setText(text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn2.getText().toString();
                textview2.setText(text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn3.getText().toString();
                textview2.setText(text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn4.getText().toString();
                textview2.setText(text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn5.getText().toString();
                textview2.setText(text);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn6.getText().toString();
                textview2.setText(text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn7.getText().toString();
                textview2.setText(text);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn8.getText().toString();
                textview2.setText(text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btn9.getText().toString();
                textview2.setText(text);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString()+btnDot.getText().toString();
                textview2.setText(text);
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace;
                if(textview2.getText().length()>0)
                {
                    StringBuilder stringBuilder = new StringBuilder(textview2.getText());
                    stringBuilder.deleteCharAt(textview2.getText().length()-1);
                    backspace = stringBuilder.toString();
                    textview2.setText(backspace);
                }
            }
        });

        // code for operators

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation = "%";
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation = "+";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation = "-";
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation = "*";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first = Double.parseDouble((String)textview2.getText());
                primary = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation = "/";
            }
        });

        //Equal operator

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Double.parseDouble((String) textview2.getText());
                if(operation == "+")
                {
                    result = first+second;
                    answer=String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation == "-")
                {
                    result = first-second;
                    answer=String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation == "*")
                {
                    result = first*second;
                    answer=String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation == "/")
                {
                    result = first/second;
                    answer=String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation == "%")
                {
                    result = first%second;
                    answer=String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
            }
        });


    }
}