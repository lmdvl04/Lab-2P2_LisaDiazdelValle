/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

import java.util.Scanner;

/**
 *
 * @author HTS
 */
public class Lab2P2_LisaDiazdelValle {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Registro de inmueble/solar");
            System.out.println("2. Manejo de estados");
            System.out.println("3. Login/signup");
            System.out.println("4. salir");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
            }
        } while (opcion !=4);
    }// fin while
    

}
