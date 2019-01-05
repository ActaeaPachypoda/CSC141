//*****************************************************************************************************//
//       NAME: Sarah Shaw
//      CLASS: CSC141-21
// ASSIGNMENT: Assignment 100
//   FILENAME: DistanceConverter.java
//       DATE: June 8, 2017
//DESCRIPTION: This program takes a distance that is input in yards and converts it to miles.
//*****************************************************************************************************//


import java.util.Scanner;


public class DistanceConverter
{
    public static void main (String[] args)
    {
        // Create a new scanner class
        Scanner kbd = new Scanner(System.in);

        //Input
        System.out.println("This program converts a distance in yards to one in miles");
        System.out.print("Please input a distance in yards: ");
        double yards = kbd.nextInt();
        //System.out.println("Yards: " + yards);
        double miles1 = ((yards/1760)+.5);
        //System.out.println(miles1);
        int miles = (int)(miles1);
        // Output
        System.out.println("The distance in yards of " + yards + " equals a distance in miles of " + miles);

    }
}
