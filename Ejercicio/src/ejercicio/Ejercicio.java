/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Adrian
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("SEBASTIAN PARRA");
        
        Motorola Objeto6 = new Motorola();
        Objeto6.setColor("Negro");
        Objeto6.setSerial("1548654852");
        System.out.println(Objeto6.getColor());
        System.out.println(Objeto6.getSerial());
        System.out.println("SEBASTIAN H.");
        Nokia objeto2 = new Nokia();
        objeto2.setModelo("nokia 1100"); 
        System.out.println(objeto2.getModelo());
        objeto2.setColor("Verde");
        System.out.println(objeto2.getColor());
    }
    
}
