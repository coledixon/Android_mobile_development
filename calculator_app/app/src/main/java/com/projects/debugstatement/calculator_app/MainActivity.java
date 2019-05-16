package com.projects.debugstatement.calculator_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    // helper methods && math ops
    ExtActivity ext = new ExtActivity();

    // define GUI ref vars
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnDec, btnAdd, btnSub, btnMulti, btnDiv, btnEql, btnClear;
    EditText txtVal;

    // define calc vars
    float inputVal1, inputVal2;
    boolean _add, _sub, _multi, _div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // set the UI layout

        // set global objs
        instatiateObjectRefs();

        // set onClick events
        defineBtnClickEvents();

    }

    // define global obj vals
    protected void instatiateObjectRefs()
    {
        // assign numeric btn refs
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
        btnDec = findViewById(R.id.btnDec);
        // assign func btn refs
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnEql = findViewById(R.id.btnEql);
        btnClear = findViewById(R.id.btnClear);
        // assign edittext field ref
        txtVal = findViewById(R.id.txtVal);
    }

    // define onClick events
    protected void defineBtnClickEvents()
    {
        // use @Override to
        // numeric events
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVal.setText(txtVal.getText() + "9");
            }
        });
        // func events
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
