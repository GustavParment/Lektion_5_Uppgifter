package com.GUSTAV.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();


        boolean isPlaying = true;


        do {

            System.out.println("\u001B[32m" + "ENTER INPUT: " + "\u001B[0m");
            String s = input.getString();

            switch (s){
                case "Stop" : isPlaying = false;
                      break;

                case "1" : System.out.println("\u001B[33m" + "Throwing! " + "\u001B[0m");
                    break;

                default: System.out.println("\u001B[31m" + "\nWrong input" + "\u001B[0m" );


            }


        }while(isPlaying);



    }


}
