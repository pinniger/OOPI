/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;
import java.util.Scanner;

/**
 *
 * @author Clair
 */
public class Test {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");               
        double startNumber = scan.nextDouble();
        double lessWholeNumber = Math.floor(startNumber);
        double greaterWholeNumber = Math.ceil(startNumber);

        System.out.println(lessWholeNumber + " is the smaller number and the larger number is " + greaterWholeNumber);

            
    }    
}
