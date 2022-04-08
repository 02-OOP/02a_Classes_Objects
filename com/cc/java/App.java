package com.cc.java;

public class App 
{

    /** Typkonvertierung  */
    // output(String.valueOf(2));  // int --> String
    // output(Integer.toString(2)); // int --> String
    // output("Das ist eine Ziffer: " + 2); // int --> String

    public static void main(String[] args) 
    {
        Cat cat = new Cat();
        cat.name = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;

        output("Name: " + cat.name);
        output("Fellfarbe: " + cat.furColor);
        output("Alter: " + cat.age);        
        output("----------------");

        Cat cat1 = new Cat();
        cat1.name = "Alonzo";
        cat1.furColor = "black";
        cat1.age = 35;

        output("Name: " + cat1.name);
        output("Fellfarbe: " + cat1.furColor);
        output("Alter: " + cat1.age);        
        output("----------------");


    }



    public static void output(String outputStr) 
    {
        System.out.println(outputStr);
    }

}



