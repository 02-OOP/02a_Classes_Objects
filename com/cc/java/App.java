package com.cc.java;

public class App 
{

    /** Typkonvertierung  */
    // output(String.valueOf(2));  // int --> String
    // output(Integer.toString(2)); // int --> String
    // output("Das ist eine Ziffer: " + 2); // int --> String

    public static void main(String[] args) 
    {
        Cat cat = new Cat("Grizabella", "white", 29);

        output("Name: " + cat.getName());
        output("Fellfarbe: " + cat.getFurColor());
        output("Alter: " + cat.getAge());        
        output("----------------");

       
        Cat cat1 = new Cat("Alonzo", "black", 35);

        // cat1.furColor = "grey"; // nicht mehr möglich
        cat1.setFurColor("grey"); // über Setter

        output("Name: " + cat1.getName());
        output("Fellfarbe: " + cat1.getFurColor());
        output("Alter: " + cat1.getAge());        
        output("----------------");
    }

    public static void output(String outputStr) 
    {
         System.out.println(outputStr);
    }

}



