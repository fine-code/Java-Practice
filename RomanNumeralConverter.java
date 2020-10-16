public class RomanNumeralConverter extends GaddisChallenges {

    private int userNumber;
    private String[] romanNumerals = ["I", "II", "III", "IV", "V", 
                                    "VI", "VII", "VIII", "IX", "X"];

    private void start() {
        print("Enter a number within the range of 1 through 10");
        userNumber = scan.nextInt();
        if (userNumber >= 1 && userNumber <= 10) {
            print("The Roman Numeral for " + userNumber 
                    + " is " + convert(userNumber));
        }
        else {
            print("Error: you chose a number that is out of range")
        }
    }

    private String convert(int number) {
        return romanNumerals[number-1];
    }

}