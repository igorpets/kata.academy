package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int myInt;
        short myShort;
        byte myByte;
        long myLong;
        boolean myBool;
        double myDouble;
        float myFloat;
        char myChar;
        myInt = 570101030;
        myShort = 32321;
        myByte = 34;
        myLong = 92312345123921212L;
        if (myByte > 15)
            myBool = true;
        else
            myBool = false;
        myDouble = 1.002;
        myFloat = 2.008f;
        myChar = 'A';
        System.out.println("Hello world 1 "+myByte+" "+ myShort+" "+myInt+" "+ myLong+" !");
        System.out.println("Hello world 2 "+myFloat+" "+ myDouble+" "+myChar+" "+ myBool+" !");

        Person person1 = new Person();
        person1.name = "Egor";
        person1.age = 34;
        System.out.println("Меня зовут = " + person1.name+", мне "+person1.age +" лет.");

        Person person2 = new Person();
        person2.name = "Михаил";
        person2.age = 23;
        System.out.println("Меня зовут = " + person2.name+", мне "+person2.age +" лет.");
    }
}

class Person {
    String name;
    int age;
}