/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

import java.util.ArrayList;
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
        ArrayList user = new ArrayList();
        ArrayList registro = new ArrayList();

        int opcion = 0;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Registro de inmueble/solar");
            System.out.println("2. Manejo de estados");
            System.out.println("3. Login/signup");
            System.out.println("4. salir");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    int op3 = 0;
                    do {
                        System.out.println("1. Crear");
                        System.out.println("2. Listar");
                        System.out.println("3. Modificar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Vender");
                        System.out.println("6. Volver");
                        System.out.println("Ingrese la opcion: ");
                        op3 = leer.nextInt();
                        
                        switch(op3){
                            case 1:{
                                
                            }break;
                        }
                        
                        

                    } while (op3 != 6);

                }
                break;
                case 2: {

                }
                break;
                case 3: {
                    String nombre = "";
                    int edad = 0;
                    String username = "";
                    String pass = "";
                    Usuarios u = new Usuarios(nombre, edad, username, pass);
                    int op2 = 0;
                    do {
                        System.out.println("1. Ya tienes cuenta? Log in");
                        System.out.println("2. No tienes? Crea una");
                        System.out.println("Elige la opcion");
                        op2 = leer.nextInt();

                        switch (op2) {
                            case 1: {
                                System.out.println("Ingrese su user: ");
                                username = leer.next();
                                System.out.println("Ingrese su pass: ");
                                pass = leer.next();
                            }
                            break;

                            case 2: {
                                System.out.println("Ingrese su nombre: ");
                                nombre = leer.next();
                                System.out.println("Ingrese su edad: ");
                                edad = leer.nextInt();
                                System.out.println("Cree un  username: ");
                                username = leer.next();
                                System.out.println("Cree un password: ");
                                pass = leer.next();
                                user.add(username);
                                user.add(pass);

                            }
                            break;
                        }
                    } while (opcion != 3);
                }
            }
        } // fin while
        while (opcion != 8);
    }//fin del main

}
