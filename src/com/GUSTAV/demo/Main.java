package com.GUSTAV.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player namen: ");
        String playerName = sc.nextLine();

        System.out.println("Player #1: " + playerName);
    }
}
