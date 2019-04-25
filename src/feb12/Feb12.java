/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feb12;

import java.util.Scanner;

/**
 *
 * @author rciarl8967
 */
public class Feb12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade = 0;
        double total = 0;
        int numberOfGrades = 0;
        int number;
        String yesNoAnswer;
        double average;

        
        do {

            System.out.printf("Please enter a grade #%d:", numberOfGrades+1);
            grade = input.nextDouble();
            total = total + grade;
            numberOfGrades++;

            System.out.println("Do you have another grade to enter? (Y/N)");
            yesNoAnswer = input.next();
        } while (yesNoAnswer.equalsIgnoreCase("Y"));

        average = total / numberOfGrades;
        System.out.printf("Average is: %.2f ", average);

    }

}
