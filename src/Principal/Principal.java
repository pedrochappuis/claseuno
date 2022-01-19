/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

/**
 *
 * @author pedrochappuis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*
        
            Dada 5 calificaciones de un alumno 
        obtenidas a lo largo del 
        semestre, construya un programa que imprima el 
        promedio de sus calificaciones.
        
        */
        String n_alumno ="Matias";
        double n1 = 6;
        double n2 = 6;
        double n3 = 6;
        double n4 = 6;
        double n5 = 6;
        
        double resultado= n1+n2+n3+n4+n5;
        
        double promedio = resultado/5;
        
        System.out.println("Promedio del alumno");
        System.out.println(n_alumno);
        System.out.println(promedio);

    }
    
}
