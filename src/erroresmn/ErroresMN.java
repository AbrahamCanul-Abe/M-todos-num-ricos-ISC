/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erroresmn;

import java.util.Scanner;

/**
 *
 * @author OuGi Abraham
 */
public class ErroresMN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingrese el valor real");
        double x=kb.nextDouble();
        System.out.println("Ingrese el valor aproximado");
        double y=kb.nextDouble();
        
        Errores error=new Errores(x,y);
        System.out.println("Error absoluto: " + error.errorabsoluto());
        System.out.println("Error relativo: " + error.errorrelativo());
        System.out.println("Error relativo porcentual: " + error.errorrelativoporcentual());
    }
    
}
