package com.torryharris.driver;

import com.torryharris.model.Calculator;


public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("2+3="+calculator.add(2,3));
    }
}
