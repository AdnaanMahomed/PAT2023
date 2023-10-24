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
public class AdminBack {

    

    
    
   //adding the airport to the database

    /**
     *
     * @throws IOException
     */
    public static String AddAirp (String name, String country, int Xcoord, int Ycoord) throws IOException{
        String correctAirport = name + "" + country + "#" + Xcoord + "" + Ycoord+ "/n";
         
        return correctAirport;  
    }
           
    //changing the selected airport in the database

    /**
     *
     * @throws IOException
     */
    public static String EditAirp (String name, String country, int Xcoord, int Ycoord) throws IOException{
        String correctAirport = name + "" + country + "" + Xcoord + "" + Ycoord + "#";

        return correctAirport;
        
    }
    
    public static String AddAircraft (String name, int speed) throws IOException{
        String correctAircraft = name + "#" + speed + "/n";
        
        return correctAircraft;
        
    }
    
    public static String EditAircraft (String name, int speed) throws IOException{
        String correctAircraft = name + "#" + speed + "/n";
        
        return correctAircraft;
        
    }
    
    
    public static String AddFlight (String departure, String arrival, String aircraft) throws FileNotFoundException, IOException{
        String correctFlight = departure + "" + arrival + "#" + aircraft + "/n";

        return correctFlight;
    }
    
    public static String EditFlight (String departure, String arrival, String aircraft) throws FileNotFoundException, IOException{
        String correctFlight = departure + "" + arrival + "" + aircraft + "#";

        return correctFlight;
    }
    
}
