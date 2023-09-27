/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Adnaa
 */
public class AdminBeck {

    
    String departure = "this";
    String arrival = "test";
    int day = 6;
    int month = 4;
    int year = 7;
    String name = "null";
    String country = "null";
    int Xcoord = 0;
    int Ycoord = 0;
    
    
   //adding the airport to the database

    /**
     *
     * @throws IOException
     */
    public void AddAirp () throws IOException{
       File Fli = new File("data//Airports.txt");
       FileWriter fliWrite = new FileWriter(Fli, true);
       
       fliWrite.write(name + "#" + country + "#" + Xcoord + "#" + Ycoord);
        
    }
           
    //changing the selected airport in the database

    /**
     *
     * @throws IOException
     */
    public void EditAirp () throws IOException{
      File fli = new File("data//Airports.txt");
      Scanner scFli = new Scanner(fli).useDelimiter("#");
      FileWriter fliWrite = new FileWriter(fli, true);
       
        while (scFli.hasNext()) {            
            if (scFli.next().equals(name + "#" + country + "#" + Xcoord + "#" + Ycoord)) {
                scFli.remove();
                fliWrite.write(name + "#" + country + "#" + Xcoord + "#" + Ycoord);
            }
        }
      fliWrite.write(name + "#" + country + "#" + Xcoord + "#" + Ycoord);
        
    }
    
    
    public void AddFlight (String[] correctFlights) throws FileNotFoundException, IOException{
       File Fli = new File("data//Airports.txt");
       FileWriter FliWrite = new FileWriter(Fli, true);
       
       FliWrite.write(departure + "#" + arrival + "#" + day + "," + month + "," + year);
    }
    public void EditFlight (String[] correctFlights) throws FileNotFoundException, IOException{
    File fli = new File("data//Airports.txt");
    Scanner scFli = new Scanner(fli).useDelimiter("#");
    FileWriter fliWrite = new FileWriter(fli, true);
       
       
       
       
       
       
    }
    
}
