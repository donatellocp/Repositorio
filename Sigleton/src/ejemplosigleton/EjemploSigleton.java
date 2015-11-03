/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplosigleton;

/**
 *
 * @author User
 */
public class EjemploSigleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Logger logger1 = Logger.getIntance();
       // logger1.log("Hola Mundo");        
         Logger logger2 = Logger.getIntance();
         
         logger1.setValue("Mensaje");
         System.out.println(logger2.getValue());
        
    }
    
}
