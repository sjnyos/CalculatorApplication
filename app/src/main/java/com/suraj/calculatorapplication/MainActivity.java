package com.suraj.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.FloatArrayEvaluator;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etValue;
    private Button btnOne,btnTwo,btnThree,btnFour,
            btnFive,btnSix,btnSeven,btnEight,btnNine,
            btnZero,btnDecimal,btnAc,btnAdd,btnSubstract,
            btnMultiply,btnDivide,btnCalculate;

    float finalValue =0 ;
    float value=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etValue = findViewById(R.id.etValue);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubstract = findViewById(R.id.btnSubstract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnDivide = findViewById(R.id.btnDivide);
        btnAc = findViewById(R.id.btnAc);
        btnCalculate=findViewById(R.id.btnCalculate);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnOne.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnTwo.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnThree.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnFour.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnFive.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnSix.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnSeven.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnEight.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnNine.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value =Float.parseFloat(btnZero.getText().toString()) ;
                etValue.setText(  Float.toString(value));
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  value =Float.parseFloat(btnAc.getText().toString()) ;
                etValue.setText(  Float.toString(0));
                value=0;
                finalValue=0;
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                value =Float.parseFloat(btnDecimal.getText().toString()) ;
//                etValue.setText(  Float.toString(finalValue));
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArithematicCalculationFromString   arithematicCalculationFromString
                        = new ArithematicCalculationFromString(value,finalValue);
               String answer = arithematicCalculationFromString.doCalclation("+");
               finalValue =Float.parseFloat( answer);
               etValue.setText(answer);
            }
        });
        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArithematicCalculationFromString   arithematicCalculationFromString
                        = new ArithematicCalculationFromString(value,finalValue);
               String answer = arithematicCalculationFromString.doCalclation("-");
                finalValue =Float.parseFloat( answer);
                etValue.setText(answer);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArithematicCalculationFromString   arithematicCalculationFromString
                        = new ArithematicCalculationFromString(value,finalValue);
                String answer = arithematicCalculationFromString.doCalclation("*");
                finalValue =Float.parseFloat( answer);
                etValue.setText(answer);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArithematicCalculationFromString   arithematicCalculationFromString
                        = new ArithematicCalculationFromString(value,finalValue);
                String answer = arithematicCalculationFromString.doCalclation("/");
                finalValue =Float.parseFloat( answer);
                etValue.setText(answer);
            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArithematicCalculationFromString   arithematicCalculationFromString
                        = new ArithematicCalculationFromString(value,finalValue);
                String answer = arithematicCalculationFromString.doCalclation("=");
                finalValue =Float.parseFloat( answer);
                etValue.setText(answer);
            }
        });

    }
}
