/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adnaa
 */
public class Paymentback {
    
    
    public static double PricClac (double Xcoord, double Xcoord2, double Ycoord, double Ycoord2, int cass, String departure,String arrival ) throws FileNotFoundException, IOException {
       File Fli = new File("data//Booked .txt");
       FileWriter FliWrite = new FileWriter(Fli, true);
       double price = 0;
       
       
        price = Math.sqrt(((Xcoord - Xcoord2) * (Xcoord - Xcoord2)) + ((Ycoord - Ycoord2) * (Ycoord - Ycoord2))) * cass;
        
        FliWrite.write(departure + "" + arrival + "#");
        
        return price;
         
     }
}
