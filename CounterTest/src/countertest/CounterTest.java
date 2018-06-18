/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countertest;

/**
 *
 * @author Clair
 */
public class CounterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Counter counter1 = new Counter();                
        counter1.click();
        counter1.click();
        counter1.click();
        System.out.println("counter 1 has " + counter1.getCount() + " clicks");
        
        Counter counter2 = new Counter();
        counter2.click();
        counter2.click();
        counter2.click();
        counter2.click();
        System.out.println("counter 2 has " + counter2.getCount() + " clicks");
        
        counter1.reset();
        System.out.println("counter 1 has been reset and now has " + counter1.getCount() + " clicks");
        
        counter2.reset();
        System.out.println("counter 2 has been reset and now has " + counter2.getCount() + " clicks");        
    }
    
}
