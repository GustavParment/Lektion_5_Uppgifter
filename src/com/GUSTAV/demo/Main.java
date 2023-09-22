package com.GUSTAV.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();


        System.out.println("Enter number: ");

        while(!input.sc.hasNextInt()){

            System.out.println("Wrong datatype, try again! ");
            input.sc.next();

        }




    //uppgift 6


    }
}
