package com.zendesk;

import java.util.Scanner;

public class GetInputFromUser {
    public static String getInput(){
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        System.out.println("\nWelcome to Zendesk Search");
        System.out.println("Type 'quit' to exit at any time, Press 'Enter' to continue\n\n");
        System.out.println("\tSelect search options:");
        System.out.println("\t* Press 1 to search Zendesk");
        System.out.println("\t* Press 2 to view a list of searchable fields");
        System.out.println("\t* Type 'quit' to exit\n");

        String s = in.nextLine();
        //System.out.println("You entered string "+s);

        return s;

    }
}
