package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello ");
        String a = in.nextLine();
        System.out.println("What's your Favorite Color? ");
        String Color = in.nextLine();
        System.out.println("You like " + Color);


    }
}