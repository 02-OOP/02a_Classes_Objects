package com.cc.java;

public class App 
{
    public static void main(String[] args) 
    {
        Cat cat = new Cat();
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.tellYourAddress());
        output("----------------");

        Cat cat1 = new Cat();
        output("Blick von aussen: " + cat1);
        output("Blick von innen: " + cat1.tellYourAddress());
        output("----------------");    

    }



    public static void output(String outputStr) 
    {
        System.out.println(outputStr);
    }

}



