package com.GUSTAV.demo;

import java.util.Scanner;

public class Input {
    public Scanner sc;

    public Input(){

       sc = new Scanner(System.in);

    }
    public String getString(){

        return sc.nextLine();
    }

    public int getInteger(){

        return sc.nextInt();
    }


}
