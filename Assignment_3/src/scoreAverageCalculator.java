//********************************************************************************//
//       NAME: Sarah Shaw                                                         //
//      CLASS: CSC141-21                                                          //
// ASSIGNMENT: Assignment 3                                                       //
//   FILENAME: scoreAverageCalculator.java                                        //
//       DATE: June 22, 2017                                                      //
//DESCRIPTION: This program takes the average of a group of integer test scores   //
//             that have been input by the user.                                  //
//********************************************************************************//

import java.text.DecimalFormat;
import java.util.Scanner;

public class scoreAverageCalculator {
   public static void main(String[] args) {
      Scanner kbd = new Scanner(System.in);
      DecimalFormat percent = new DecimalFormat("##0.00");

      //Directions
      System.out.println("Enter test scores and get the lowest score," +
              " the highest score, and the average.");
      System.out.println("Enter 999 to quit");

      //Controls and Prompts
      final int sentinel = 999;
      final String prompt = ("Enter a score [0..100] (999 to quit): ");
      final String promptWrong = ("Enter only 0..100 (999 quits): ");

      //Starting Variables
      int score = 0;
      int maxScore = 100;
      int scoreCount = 0;
      int scoreTotal = 0;
      int lowScore = 200;
      int highScore = 0;

      //Input Scores
      System.out.print(prompt);
      while (score!=sentinel) {
         score = kbd.nextInt();

         if (score >= 0 && score <= maxScore) {
            scoreTotal = scoreTotal + score;
            if (score > highScore) {
               highScore = score;
            }
            if (score < lowScore) {
               lowScore = score;
            }
            scoreCount++;
         }
         else if (score==sentinel) {
            break;
         }
         if (score<0 || score>maxScore) {
            System.out.printf("%38s", promptWrong);
         }
         else {
            System.out.printf("%37s", prompt);
         }
      }
      double avgScore = avgScore(scoreTotal, scoreCount);
      String avgFormat = percent.format(avgScore);

      //Output Results
      printResults(lowScore, highScore, avgFormat, scoreCount);
   }

   public static double avgScore(int scoreTotal, int scoreCount)
   {
      double avgScore = ((double)scoreTotal/(double)scoreCount);
      return avgScore;
   }
   public static void printResults(int lowScore, int highScore, String avgFormat, int scoreCount)
   {
      System.out.println("         Results");
      System.out.printf("The lowest score is %d%n", lowScore);
      System.out.printf("The highest score is %d%n", highScore);
      System.out.printf("The average score is %s%n", avgFormat);
      System.out.printf("There were %d scores%n", scoreCount);
   }
}