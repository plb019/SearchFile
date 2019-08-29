package com.zendesk;

public class Main {

    public static void main(String[] args) {

        //Get input from User
        String userResponse = "";

        while (!userResponse.equalsIgnoreCase("quit")) {

            userResponse = GetInputFromUser.getInput();

            switch (userResponse) {
                case "1":
                    System.out.println(Search.searchZendesk());
                    break;
                case "2":
                    View.viewFields();
                    break;
                case "quit":
                    break;
                default:
                    //unexpected response
                    System.out.println("Please enter a valid selection");
            }

        }
    }
}
