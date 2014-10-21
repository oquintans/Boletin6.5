/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("Paul", "Auster");
        Libro libro = new Libro("La trilogía de Nueva York", autor);
        System.out.println(libro.getTitulo() +" de "+ (libro.getAutor()).toString());
    }
}
