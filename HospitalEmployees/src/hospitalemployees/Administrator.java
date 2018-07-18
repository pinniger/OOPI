/*
 * Clair Inniger
 * PP 9.2 (page 446)
 * 07/16/2018
 */
package hospitalemployees;


public class Administrator extends Employee {
    public void introduction(){
        System.out.println("Hello, my name is " + name + " and I'm the administrator for " + department);
    }
    
    public void doWork(){
        System.out.println("I am doing all the things hospital administrators do.");
    }
}
