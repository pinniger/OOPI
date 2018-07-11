/*
 * Clair Inniger
 * PP 7.12
 * 07-10-2018
 */
package StudentExample;
public class StudentExample {

    public static void main(String[] args) {

        Address school = new Address("800 Lancaster Ave.", "Villanova","PA", 19085);
        Address jHome = new Address("21 Jump Street", "Blacksburg","VA", 24551);
        Student john = new Student("John", "Smith", jHome, school, 78, 86, 98);
        System.out.println(john.toString());

    }
}
