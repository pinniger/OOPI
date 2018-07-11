/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clair
 */
public class Address {
   private String streetAddress, city, state;
   private long zipCode; 

   //-----------------------------------------------------------------
   //  Constructor: Sets up this address with the specified data.
   //-----------------------------------------------------------------
   public Address(String street, String town, String st, long zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   } 

   //-----------------------------------------------------------------
   // Returns a description of this Address object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result; 

      result = streetAddress + "\n";
      result += city + ", " + state + " " + zipCode; 

      return result;

}
