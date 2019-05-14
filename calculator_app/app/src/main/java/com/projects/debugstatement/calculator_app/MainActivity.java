package com.projects.debugstatement.calculator_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import androic.widget.Button;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // define GUI ref vars
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnDec, btnAdd, btnSub, btnMulti, btnDiv, btnEql;
    EditText txtVal;

    // define calc vars
    float inputVal1, inputVal2;
    boolean _add, _sub, _multi, _div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign numeric btn refs
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

    }
}
