package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int number = 100;
        String name = "bob";
        Date date = new Date();

        // primitive data type
        byte theByte = 124;
        short theShort= 4343;
        int theInt= 1232345;
        long theLong = 23512152;
        float pi = 3.14F;
        double doublePi = 3.1415;
        boolean bool = true;
        char theChar = 'A';

        //reference type
        String intro = new String("hello world");
        String intro2 = "here we go";
        System.out.println(intro.toUpperCase());
        // primitive vs reference

        int a= 10;
        int b = a;
        a = 1000;
        // a will change, but b will not, as they have difference points in memory

        Person C = new Person("personC", 23,400);
        Person D = C;
        C.name = "a new name ";
        //person c and person d will have the same new value
        // as they both point to the same place referenced in memory, as the class act as a template

        // comparison ops
        int age1 =5;
        int age3 = 50;
        System.out.println(age3<age1);
        // can have < > = !

        //Logical ops-> && ||

        // if statement
        if(age1< 10){
            System.out.println("You are less than 10");
        }else if (age3== 10){
            System.out.println("You are 10");
        }else {
            System.out.println("You are older than 10");
        }
        // ternary ops
        String message = age3 >=18 ? "you are an adult": "you are not an adult";
        System.out.println(message);

        // switch statement

        String gender = "FEMALE";

        switch (gender){
            case "FEMALE":
                System.out.println("FEMALE");
                break;
            case "MALE":
                System.out.println("MALE");
                break;
            case "N/A":
                System.out.println("N/A");
                break;
            default:
                System.out.println("UNKNOWN");
        }

        // Array

        // Static

        int [] numbers = new int[2];
        int [] arr = {1,3,4,4};
        // int [] var=  {} <- you don't need to init size

        numbers[0]= 1;
        numbers[1]= 2;

        // for loop

        for (int i =1; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //enhance for loop
        for (int num : numbers){
            System.out.println(num);
        }
        Arrays.stream(arr).forEach(System.out::println);
        //-------------------------------------------------------------
        //TIME IN VIDEO-> 2:09:00
        //-------------------------------------------------------------
        int c = 0;
        while (c<20){
            System.out.println(c);
            c++;
        }

        int cDo = 0;
        do{
            cDo ++;
        }while (cDo<20);

        //scanner
        System.out.println("How old are you");
        //Scanner scanner = new Scanner(System.in);
        //Integer age =2020- scanner.nextInt();
        //System.out.println("You are born in " + age.toString());

        // methods
        char [] letter = {'A','A','D' ,'A','S','D'};
        int count = countCharOccurrences(letter, 'A');
        System.out.println(count);

        Person personB = new Person("Sam", 23, 80);
        personB.printInfo();
        System.out.println("----------------");
        System.out.println(personB.name);
        System.out.println(personB.getAge());
        System.out.println(personB.toString());

    }

    public static int countCharOccurrences(char[] letters, char searchLetter){
        int c= 0 ;
        for (char letter : letters){
            if (letter == searchLetter){
                c++;
            }
        }
        return c;
    }

    static class Person {

        public String name;
        private int age;
        private int weight;


        Person(String name, int age, int weight){
            this.age= age;
            this.name = name;
            this.weight= weight;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public  String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public  void printInfo (){
            System.out.println("Person -> " +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight );
        }
    }
}
