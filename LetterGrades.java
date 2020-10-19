public class LetterGrades {

    private int numTests = 3;
    private double[] testGrades[];
    private double average; 
    private char letterGrade; 
    
    public void start() {

        collectInfo();

        calculateAverage(); 

        calculateLetterGrade();

        print(" You average is " + average + "and you letter grade is " + letterGrade);

    }

    private void collectInfo() {

        for (int i = 1; i <= numTests; i++) {
            print("What was your grade on Test " + i + "?")
            testGrades[i] = scan.nextDouble();  
        }
       
    }

    private void  calculateAverage() {
        int sumTestGrades = 0;
        for (int i = 1; i <= testGrades.length; i ++) {
            sumTestGrades += testGrades[i]; 
        }
        average = sumTestGrades / numTests;
    }

    private void calculateLetterGrade() {
        if (average >= 90) {
            letterGrade = 'A';
        }
        else if (average >= 80) {
            letterGrade = 'B';
        }
        else if (average >= 70) {
            letterGrade = 'C';
        }
        else if (average >= 60) {
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }

    }
}