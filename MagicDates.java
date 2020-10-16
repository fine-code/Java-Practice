public class MagicDates extends GaddisChallenges {

    private int userMonth;
    private int userDay;
    private int userYear;

    private int[] numDaysInMonth = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    public void start() {
        print("Ready for some magic? Let's see if you can guess a Magic Date! ");
        
        print("Enter a numerical value for a month: (Example: 1 for January");
        int tempMonth = scan.nextInt();
        if(tempMonth > 0 && <= 12) {
            userMonth = tempMonth;
        }
        else {
            print("You entered a value that is out of range");
        }

        print("Enter a day in the month: (Example: 15 for the 15th of the month");
        tempDay = scan.nextInt();
        if (tempDay > 0 && <= numDaysInMonth[userMonth - 1]) {
            userDay = tempDay;
        }
        else {
            print("That day is invalid");
        }

        print("Enter a two-digit year: (Example: 08 for 2008");
        tempYear = scan.nextInt();
        if (tempYear.toString().length() == 2) {
            userYear = tempYear;
        }
    
        if (calculateMagic()) {
            print("Hooray! You chose a Magic Date! " +
                    userMonth " * " + userDay + " = " + userYear)
        }

    }

    private void calculateMagic() {
        return (userMonth * userDay == userYear);
    }
}