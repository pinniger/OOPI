/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingdemo;

/**
 *
 * @author Clair
 */
public class SortingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[] {5,8,25,55};
        
        Sorting<int[]> sort = new Sorting<int[]>();
        sort.selectionSort(numbers);
        
        
    }
    
}
