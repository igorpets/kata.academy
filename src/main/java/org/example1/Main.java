package org.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        myFloat = 3 / 2f;
        myFloat += 4f;
        myChar = 'A';
        System.out.println("Hello world 1 " + myByte + " " + myShort + " " + myInt + " " + myLong + " !");
        System.out.println("Hello world 2 " + myFloat + " " + myDouble + " " + myChar + " " + myBool + " !");
        myFloat++;
        System.out.println("Hello world 3 " + myFloat);

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

        String fname, lname, phone, space;
        fname = "Ввсилий";
        lname = "Петров";
        phone = "+7989-34-56";
        space = " ";
        System.out.println(fname + space + lname + space + phone);

        String cmp1 = "Java", cmp2 = "JaVa";
        System.out.println(cmp1.compareTo(cmp2) + " " + cmp1.compareToIgnoreCase(cmp2) + " " + cmp1.concat(cmp2));
        System.out.println(cmp1.equals(cmp2) + " " + cmp1.equalsIgnoreCase(cmp2));

        String line = "first string on the board everyday";
        String[] strings = line.split(" ");
        String result = "";
        for (String word : strings) {
            result += word.toUpperCase() + " ";
        }
        System.out.println(result.trim() + "!");

        String str = new String("JavaHolder");
        StringBuilder stringBuilder = new StringBuilder(20);
        System.out.println("1# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);
        stringBuilder.ensureCapacity(50);
        //stringBuilder.setLength(200);
        System.out.println("2# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);
        stringBuilder.append("JavaHoldeR");
        System.out.println("3# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);
        stringBuilder.append("ParentMini1234567890parent4566242343243242432442");
        System.out.println("4# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);
        stringBuilder.insert(1, "=ADD=");
        System.out.println("5# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);
        stringBuilder.delete(1, 6);
        stringBuilder.delete(20, 150);
        System.out.println("6# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("7# " + " len=" + stringBuilder.length() + " cap = " + stringBuilder.capacity() + " " + stringBuilder);

        Robot<BigHead, Body> robot1 = new Robot(new BigHead(), new Body());
        Robot<MediumHead, Body> robot3 = new Robot(new MediumHead(), new Body());
        Robot<SmallHead, Body> robot2 = new Robot(new SmallHead(), new Body());

        robot1.getHead().attack();
        robot2.getHead().defence();
        robot3.getHead().repair();

        try (FileReader file = new FileReader("gradlew")) {
            myReadFile();
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("FnF" + e.toString());
        } catch (IOException e) {
            System.out.println("IO " + e.toString());
        }
        String str1 = "A123450B";
        System.out.println(str1.replaceAll("\\D", ""));
    }

    private static void myReadFile() throws FileNotFoundException {
        FileReader file = new FileReader("BUBUtu");
        Scanner scan = new Scanner(file);
    }
}


class Person {
    String name;
    int age;

    void print() {
        for (int i = 0; i < 3; i++) {
            if (retPassion() > 0)
                System.out.println("Меня зовут = " + name + ", мне " + age + " лет. Моя пенсия через " + retPassion());
            else
                System.out.println("Меня зовут = " + name + ", мне " + age + " лет. Я уже на пенсии");

        }
    }

    void sayHello() {
        System.out.println("Привет " + name + "!");
    }

    int retPassion() {
        return 65 - age;
    }
}