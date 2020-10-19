import java.util.Scanner;

/*
future additions:
- threading
- GUI
*/

public class GaddisChallenges {

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        print("Starting Chapter 3 Challenges from the Gaddis book!");
        
        print("Question 1: Roman Numeral Converter");
        RomanNumeralConverter rmc = new RomanNumeralConverter();
        rmc.start();

        print("Question 2: Magic Dates");
        MagicDates mc = new MagicDates();
        mc.start();

        print("Question 3: Body Mass Index");
        BMI bmi = new bmi BMI();
        bmi.start();

        print("Question 4: Test Scores and Grade");
        LetterGrades lg = new LetterGrades();
        lg.start(); 
    }

    private void print(String text) {
        System.out.println(text);
    }

   
}