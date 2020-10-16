import java.util.Scanner;

public class GaddisChallenges {

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        print("Starting Chapter 3 Challenges from the Gaddis book!");
        
        print("Question 1: Roman Numeral Converter");
        RomanNumeralConverter rmc = new RomanNumeralConverter();
        rmc.start();

        print("Question 2: Magic Dates");
        MagicDates mc = new MagicDates();
        mc.start()
    }

    private void print(String text) {
        System.out.println(text);
    }

   
}