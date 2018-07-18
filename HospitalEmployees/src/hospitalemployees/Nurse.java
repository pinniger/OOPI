/*
 * Clair Inniger
 * PP 9.2 (page 446)
 * 07/16/2018
 */
package hospitalemployees;


public class Nurse extends Employee {

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }
    
    public void makeRounds() {
        System.out.println(name + " is makeing thier rounds.");
    }
    
    public void introduction(){
        System.out.println("Hello, my name is nurse " + name + " and I work in the " + department);
    }
}
