package com.GUSTAV.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPlaying = true;


        do {
            System.out.println("\u001b[32m"+"PRESS 'ENTER' TO CONTINUE THE LOOP" + "\u001b[0m"+
                    "\u001B[31m"+"\nOR TYP EXIT TO STOP LOOP" + "\u001B[0m");
            String result = sc.nextLine();

            if (result.equalsIgnoreCase("stop")){
                break;
            }



        }while(isPlaying );



    }
}
