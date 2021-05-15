/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;
import java.util.Scanner;
/**
 *
 * @author User
 */

public class Edad {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingresa tu año de nacimiento\n");
        Scanner scan=new Scanner(System.in);
        Difaños años=new Difaños();
        años.nacimiento=scan.nextInt();
        int total=años.Edad();
        System.out.println("\nTienes "+total+" años");
        
    }
    
}
