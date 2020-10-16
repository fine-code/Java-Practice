import java.util.Scanner;

public class GaddisChallenges {

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        print("Starting Chapter 3 Challenges from the Gaddis book!");
        print("Question 1: Roman Numeral Converter");
        romanNumeralConverter();
    }

    private void print(String text) {
        System.out.println(text);
    }

    private void romanNumeralConverter() {
        print("Enter a number within the range of 1 through 10");
        int userNumber = scan.nextInt();
        
    }
}