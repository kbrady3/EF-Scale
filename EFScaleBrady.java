//Kabrina Brady

import java.util.Scanner;

public class EFScaleBrady {
    public static void main(String[] args) {
        int selection;
        String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Three-second wind gust in MPH:");
        //Tries to parse user input to ensure that it is a number
        try {
            selection = Integer.parseInt(input.next());
            result = windspeed(selection);
            System.out.println("EF Rating: " + result);
        }
        catch (NumberFormatException ex){
            System.out.println("Enter a valid integer.");
        }
    }

    public static String windspeed(int selection){
        String error = "Error";
        String na = "Wind gusts of less than 65 MPH are not on the EF scale.";
        String positive = "Must be positive integer";
        int wind1 = 65;
        int wind2 = 85;
        int wind3 = 110;
        int wind4 = 135;
        int wind5 = 165;
        int wind6 = 200;
        String EF0 = "0";
        String EF1 = "1";
        String EF2 = "2";
        String EF3 = "3";
        String EF4 = "4";
        String EF5 = "5";

        if (selection < wind1){
            return na;
        }
        else if (selection > wind1 && selection <= wind2){
            return EF0;
        }
        else if (selection > wind2 && selection <= wind3){
            return EF1;
        }
        else if (selection > wind3 && selection <= wind4){
            return EF2;
        }
        else if (selection > wind4 && selection <= wind5){
            return EF3;
        }
        else if (selection > wind5 && selection <= wind6){
            return EF4;
        }
        else if (selection > wind6){
            return EF5;
        }
        else if (selection < 0){
            return positive;
        }
        else {
            return error;
        }
    }
}