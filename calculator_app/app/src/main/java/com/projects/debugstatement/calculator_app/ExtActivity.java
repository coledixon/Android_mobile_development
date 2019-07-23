package com.projects.debugstatement.calculator_app;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

// helper method && operations class
public class ExtActivity {

    // build parse calc function
    // parse to correct math method based on str operator
    // split numerical vals at operator
    // store each numerical val in global var
    // store operator in var

    // define global vars
    float operand1 = 0.0f, operand2 = 0.0f;
    float res;
    boolean _add, _sub, _multi, _div;


    // set global math operation
    public void setOperator(String optr)
    {
        switch(optr) {
            case "+": _add = true; _sub = _div = _multi = false;
                break;
            case "-": _sub = true; _add = _multi = _div = false;
                break;
            case "x": _multi = true; _add = _sub =  _div = false;
                break;
            case "/": _div = true;_add = _sub = _multi = false;
                break;
        }
    }

    // parse to correct mathematical eval method
    public float parseOperator(String input)
    {
        // identify specific math func
        if (_add) {
            parseOperands(input);
            res = doAdd(operand1, operand2);
        }

        return res;
    }

    // parse operands from input string
    public void parseOperands(String oprnd)
    {
        String op;
        String [] oprnds;

        if (_add) {
            oprnds = oprnd.split("+");

            for(String o:oprnds) {
                if(operand1 == 0.0f) { operand1 = Float.parseFloat(o); }
                else { operand2 = Float.parseFloat(o); }
            }
        }
    }

    // mathematical functions
    public float doAdd(float op1, float op2) {
        float sum = (op1 + op2);
        return sum;
    }

    public float doSub(float op1, float op2) {
        float sum = (op1 - op2);
        return sum;
    }

    public float doMulti(float op1, float op2) {
        float sum = (op1 * op2);
        return sum;
    }

    public float doDiv(float op1, float op2) {
        float sum = (op1 / op2);
        return sum;
    }
}
