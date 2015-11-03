/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplosigleton;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author https://www.youtube.com/watch?v=Z06Phxtj13g
 */
public class Logger {

    private static  Logger logger;
    private String value;
    
    
    private Logger() {
    }
    public  static  Logger getIntance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
    
   /* public  static synchronized Logger getIntance(){ // si son varios hilos acceden al mismo metodo
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }*/
    public  void log(String mensaje){
      System.out.println(mensaje);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
}
