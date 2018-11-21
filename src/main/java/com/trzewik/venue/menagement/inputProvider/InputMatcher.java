package com.trzewik.venue.menagement.inputProvider;

import com.trzewik.venue.menagement.enums.VenueActivity;

import java.util.Scanner;

public class InputMatcher {

    public static int collectVenueIndexFromUser(String message, int maxSizeOfVenues, String ... formats){
        while (true){
            try {
                int index = collectInteger(message, formats);
                if (index >= 0 && index <= (maxSizeOfVenues)){
                    return index;
                }
            }
            catch (Exception e){
                MessagePrinter.printErrorMessage(MessageProvider.wrongVenuesIndex);
            }
        }
    }

    public static VenueActivity collectVenueActivityFromUser(String message, String ... formats){
        while (true){
            try{
                return VenueActivity.matchActivity(collectString(message, formats));
            }
            catch (IllegalArgumentException e){
                MessagePrinter.printErrorMessage(MessageProvider.wrongActivity);
            }
        }
    }

    private static Integer collectInteger(String message, String ... formats){
        while (true){
            try {
                Scanner userInput = getMessage(message, formats);
                return userInput.nextInt();
            }
            catch (Exception e){
                MessagePrinter.printErrorMessage("Input must be an integer! Try again: ");
            }
        }
    }

    public static String collectString(String message, String ... formats){
        while (true) {
            try {
                Scanner userInput = getMessage(message, formats);
                return userInput.nextLine();
            } catch (Exception e) {
                MessagePrinter.printErrorMessage("Input must be a string! Try again: ");
            }
        }
    }

    private static Scanner getMessage(String message, String ... formats){
        Scanner userInput = new Scanner(System.in);
        MessagePrinter.printMessage(message, formats);
        return userInput;
    }
}
