/*
 * Clair Inniger
 * PP 7.12
 * 07-10-2018
 */

package studentbody;

public class StudentBody {

    public static void main(String[] args) {
        Address school = new Address("800 Lancaster Ave.", "Villanova","PA", 19085);
        Address jHome = new Address("21 Jump Street", "Blacksburg","VA", 24551);
        Student john = new Student("John", "Smith", jHome, school, 78, 86, 98);
        System.out.println(john.toString());
        
        john.setTestScore(1, 66);
        john.setTestScore(2, 88);
        john.setTestScore(3, 99);
        
        System.out.println("New test scores.");
        System.out.println(john.toString());
        
        System.out.println("Printing test scores.");
        System.out.println("Test score1: " + john.getTestScore(1));
        System.out.println("Test score2: " + john.getTestScore(2));
        System.out.println("Test score3: " + john.getTestScore(3));        
    }
}
