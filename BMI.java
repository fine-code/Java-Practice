
public class BMI extends GaddisChallenges {

    private double userWeight; //pounds
    private double userHeight;  //inches
    private double userBmi;
    private String weightStatus;

    public void start() {

        collectInfo();

        userBmi = userWeight * 703/(userHeight * userHeight);
        
        if (userBmi >= 18.5 && userBmi < 25) {
            weightStatus = "optimal";
        }
        else if (userBmi < 18.5) {
            weightStatus = "underweight";
        }
        else if (userBmi > 25) {
            weightStatus = "overweight";
        }

        print("Based on your height and weight, your BMI is " 
        + userBmi + " so your weight is " + weightStatus);

    }

    private void collectInfo() {
        print("What is your height? ");
        userHeight = scan.nextDouble();
        print("What is your weight? ");
        userWeight = scan.nextDouble();
    }

}