/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;


import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author Adnaa
 */
public class SearchFlight {
    
    
   
   
    
    public String flights (String departure, String arrival, int day, int month, int year) throws FileNotFoundException, IOException {
      String flight = departure + arrival + day + month + year;
      
        return flight;
        
        
        
      
      
    }
    
    
     
      
        
               
    
    
    
}
