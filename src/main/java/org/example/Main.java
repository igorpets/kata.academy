package org.example;

import java.util.Random;

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
        myInt = new Random().nextInt();
        myShort = 32321;
        myByte = (byte) (myInt % 100);
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
        Person person2 = new Person();
        person2.name = "Михаил";
        person2.age = 23;

        person1.print();
        person1.sayHello();
        person2.print();
        person2.sayHello();
    }
}

class Person {
    String name;
    int age;
    void print(){
        for (int i=0; i<3;i++)
            System.out.println("Меня зовут = " + name+", мне "+ age +" лет. Моя пенсия "+ retPassion());
    }
    void sayHello(){
        System.out.println("Привет " +name+"!");
    }
    int retPassion(){
        return 65-age;
    }
}