package studentbody;

/*
 * Clair Inniger
 * PP 7.12
 * 07-10-2018
 */

/**
 * PP 7.2 Modify the Student class presented in this chapter as follows.
 * [x] Each student object should also contain the scores for three tests.
 * [x] Provide a constructor that sets all instance values based on parameter values.
 * [x] Overload the constructor such that each test score is assumed to be initially zero.
 * [x] Provide a method called setTestScore that accepts two parameters: the test number (1 through 3) and the score.
 * [x] Also provide a method called getTestScore that accepts the test number and returns the appropriate score.
 * [x] Provide a method called average that computes and returns the average test score for this student.
 * [x] Modify the toString method such that the test scores and average are included in the description of the student.
 * [] Modify the driver class main method to exercise the new Student methods.
 */
public class Student {

    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int testScore1, testScore2, testScore3;
    //-----------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------

    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }

    public Student(String first, String last, Address home, Address school, int score1, int score2, int score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = score1;
        testScore2 = score2;
        testScore3 = score3;
    }

    public void setTestScore(int testNumber, int score) {
        switch (testNumber) {
            case 1:
                testScore1 = score;
                break;
            case 2:
                testScore2 = score;
                break;
            case 3:
                testScore3 = score;
        }
    }

    public int getTestScore(int testNumber) {
        switch (testNumber) {
            case 1:
                return testScore1;
            case 2:
                return testScore2;
            case 3:
                return testScore3;
            default:
                return 0;
        }
    }

    public double average() {
        return (testScore1 + testScore2 + testScore3) / 3;
    }

    public String toString() {
        String result;
        result = "Test score 1 is: " + testScore1 + "\n";
        result += "Test score 2 is: " + testScore2 + "\n";
        result += "Test score 3 is: " + testScore3 + "\n";
        result += "The average score is: " + average() + "\n";
        return result;
    }
}
