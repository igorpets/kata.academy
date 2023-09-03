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
        myDouble = 1.093;
        myFloat = 3/2f;
        myFloat += 4f;
        myChar = 'A';
        System.out.println("Hello world 1 "+myByte+" "+ myShort+" "+myInt+" "+ myLong+" !");
        System.out.println("Hello world 2 "+myFloat+" "+ myDouble+" "+myChar+" "+ myBool+" !");
        myFloat++;
        System.out.println("Hello world 3 "+myFloat);

        Person person1 = new Person();
        person1.name = "Egor";
        person1.age = 34;
        Person person2 = new Person();
        person2.name = "Михаил";
        person2.age = 78;

        person1.print();
        person1.sayHello();
        person2.print();
        person2.sayHello();

        String fname, lname, phone;
        fname = "Ввсилий";
        lname = "Петров";
        phone = "+7989-34-56";
        System.out.println(fname+" "+ lname+" "+ );

    }
}

class Person {
    String name;
    int age;
    void print(){
        for (int i=0; i<3;i++) {
            if (retPassion()>0)
                System.out.println("Меня зовут = " + name + ", мне " + age + " лет. Моя пенсия через " + retPassion());
            else
                System.out.println("Меня зовут = " + name + ", мне " + age + " лет. Я уже на пенсии");

        }
    }
    void sayHello(){
        System.out.println("Привет " +name+"!");
    }
    int retPassion(){
        return 65-age;
    }
}