/*
 * Clair Inniger
 * PP 9.2 (page 446)
 * 07/16/2018
 */
package hospitalemployees;

public abstract class Employee {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    protected String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void introduction(){
        System.out.println("Hello, my name is " + name + " and I work in " + department);
    }
}
