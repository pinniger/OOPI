/*
 * Clair Inniger
 * PP 9.2 (page 446)
 * 07/16/2018
 */
package hospitalemployees;

/**
PP 9.2 Design and implement a set of classes that define the employees of a 
* hospital: doctor, nurse, administrator, surgeon, receptionist, janitor, and so on. 
* Include methods in each class that are named according to the services provided by 
* that person and that print an appropriate message. 
* Create a main driver class to instantiate and exercise several of the classes.
 */
public class HospitalEmployees {


    public static void main(String[] args) {
        
        Doctor dr = new Doctor();
        dr.setName("Merdith Grey");
        dr.setCredentials("M.D");
        dr.setDepartment("Trama");
        dr.setSpeciality("General Surgery");        
        dr.introduction();
        dr.seePatient("Mike Fox");
        
        Nurse nurse = new Nurse();
        nurse.setName("Beth Smith");
        nurse.setDepartment("ICU");        
        nurse.introduction();
        nurse.makeRounds();
        
        Receptionist recept = new Receptionist();
        recept.setName("Peggy schmidt");
        recept.setDepartment("Orthopedic");
        recept.introduction();
        recept.SchedulePatient("James Thompson", dr);
        
        Administrator admin = new Administrator();
        admin.setName("Jackie Jackson");
        admin.setDepartment("Administration");
        admin.introduction();
        admin.doWork();

    }
    
}


