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
public class Counter {
    private int count;

    public int getCount() {
        return count;
    }
    
    public Counter() {
        this.count = 0;
    }
    
    public void reset(){
        this.count = 0;
    }
    
    public void click() {
        this.count++;
    }
}
