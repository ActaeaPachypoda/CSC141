//*************************************************************************************//
//       NAME: Sarah Shaw                                                              // 
//      CLASS: CSC141-21                                                               //
// ASSIGNMENT: Assignment 200                                                          //   
//   FILENAME: RomanNumeralConversion.java                                             //
//       DATE: June 15, 2017                                                           //
//DESCRIPTION: This program takes an integer between 1 and 20 and converts it          //
//             to Roman Numerals.                                                      //
//*************************************************************************************//


import java.util.Scanner;

public class RomanNumeralConversion
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.printf("Enter an integer in arabic numerals [1...20]" 
         + " and get it converted to Roman numerals.\n");
   
      //Input
      System.out.printf("Enter [1...20]: ");
      int arabicNum = kbd.nextInt();
      String romanNum = "null";
   
      //Switch
      switch (arabicNum) {
         case 1: romanNum = ("I");
            break;
         case 2: romanNum = ("II");
            break;
         case 3: romanNum = ("III");
            break;
         case 4: romanNum = ("IV");
            break;
         case 5: romanNum = ("V");
            break;
         case 6: romanNum = ("VI");
            break;
         case 7: romanNum = ("VII");
            break;
         case 8: romanNum = ("VIII");
            break;
         case 9: romanNum = ("IX");
            break;
         case 10: romanNum = ("X");
            break;
         case 11: romanNum = ("XI");
            break;
         case 12: romanNum = ("XII");
            break;
         case 13: romanNum = ("XIII");
            break;
         case 14: romanNum = ("XIV");
            break;
         case 15: romanNum = ("XV");
            break;
         case 16: romanNum = ("XVI");
            break;
         case 17: romanNum = ("XVII");
            break;
         case 18: romanNum = ("XVIII");
            break;
         case 19: romanNum = ("IXX");
            break;
         case 20: romanNum = ("XX");
            break;
         default: romanNum = ("Invaild");
            break;
      }
      //Output
      if (romanNum == "Invaild")
      {
         System.out.println("This is an invaild integer, please" 
            + " enter a number between 1 and 20.");
      }
      else
      {
         System.out.printf("The number %d in Roman Numerals is %s.", arabicNum, romanNum);
      }
   }
}
