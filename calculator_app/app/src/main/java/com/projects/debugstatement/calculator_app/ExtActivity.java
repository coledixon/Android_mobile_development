package com.projects.debugstatement.calculator_app;

// helper method && operations class
public class ExtActivity {

    // build parse calc function
    // parse to correct math method based on str operator
    // split numerical vals at operator
    // store each numerical val in global var
    // store operator in var

    // possible operators to be eval'd
    String [] operators = {"+", "-", "*", "/"};

    // define global vars
    String operator;
    float operand1, operand2;

    // indentify
    public void parseOperator(String input)
    {
        for (String o : operators) {
            if (input.contains(o)) {
                String [] nums = input.split(o);
                for(String n : nums) {
                    System.out.println(n);
                }
            }
        }

        // identify specific math func
        switch (operator) {
            case "+": doAdd(operand1, operand2);
                break;
            case "-": doSub(operand1, operand2);
                break;
            case "*": doMulti(operand1, operand2);
                break;
            case "/": doDiv(operand1, operand2);
                break;
            default: doAdd(operand1, operand2);
                break;
        }
    }

    public float doAdd(float op1, float op2) {
        float res = (op1 + op2);
        return res;
    }

    public float doSub(float op1, float op2) {
        float res = (op1 - op2);
        return res;
    }

    public float doMulti(float op1, float op2) {
        float res = (op1 * op2);
        return res;
    }

    public float doDiv(float op1, float op2) {
        float res = (op1 / op2);
        return res;
    }
}
