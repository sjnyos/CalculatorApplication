package com.suraj.calculatorapplication;

public class ArithematicCalculationFromString {

    private float value;
    private float finalValue;
    public ArithematicCalculationFromString(float value,float finalValue){
        this.value=value;
        this.finalValue= finalValue;
    }

    public String doCalclation(String operators) {

        switch (operators) {
            case "+": {
                finalValue +=   value;
                return  Float.toString(finalValue);

            }
            case "-": {
                finalValue -= value;
                return Float.toString(finalValue);


            }
            case "*": {
                finalValue *= value;
                return Float.toString(finalValue) ;


            }
            case "/": {
                finalValue /= value;
                return Float.toString(finalValue);
            }
            case  "=":{

                return Float.toString(finalValue);
            }
            default: {
            return "0";
            }
        }

    }



}
