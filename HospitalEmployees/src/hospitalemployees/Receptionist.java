/*
 * Clair Inniger
 * PP 9.2 (page 446)
 * 07/16/2018
 */
package hospitalemployees;


public class Receptionist extends Employee {
    public void introduction() {
        System.out.println("Hello, my name is " + name + " and I work in " + department);
    }
    
    public void SchedulePatient(String patientName, Doctor dr){
        System.out.println(name + " is scheduling " + patientName + " to be seen by " + dr.getName());
    }
}
