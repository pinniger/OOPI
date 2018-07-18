/*
 * Clair Inniger
 * PP 9.2 (page 446)
 * 07/16/2018
 */
package hospitalemployees;


public class Doctor extends Employee {
    
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    private String credentials;

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public void seePatient(String patientName) {
        System.out.println(name + " is seeing " + patientName);
    }
    
    public void introduction(){
        System.out.println("Hello, my name is Dr. " + name + " and I work in " + department + ". My speciality is " + speciality + ".");
    }
}
