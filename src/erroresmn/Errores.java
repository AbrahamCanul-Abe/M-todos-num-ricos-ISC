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

public class Errores {

    private double Vreal;
    private double Vaproximado;
    double errorabsoluto,errorRelativo, errorPorcentual;
    
    public Errores (double Vreal, double Vaproximado){
        this.Vreal=Vreal;
        this.Vaproximado=Vaproximado;
        
    }
    public double errorabsoluto (){
        errorabsoluto=Vreal-Vaproximado;
        return errorabsoluto;
    }
    public double errorrelativo (){
        errorRelativo=errorabsoluto/Vreal;
        return errorRelativo;
    }
    public double errorrelativoporcentual (){
        errorPorcentual=errorrelativo ()*100;
        return errorPorcentual;
    } 
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