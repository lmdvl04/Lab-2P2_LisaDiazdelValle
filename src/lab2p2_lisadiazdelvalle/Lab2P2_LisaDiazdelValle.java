/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

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
                        System.out.println("---MENU---");
                        System.out.println("1. Crear");
                        System.out.println("2. Listar");
                        System.out.println("3. Modificar");
                        System.out.println("4. Borrar");
                        System.out.println("5. Vender");
                        System.out.println("6. Volver");
                        System.out.println("Ingrese la opcion: ");
                        op3 = leer.nextInt();

                        switch (op3) {
                            case 1: {
                                int menuAgregar = 0;
                                do {
                                    System.out.println("---AGREGAR---");
                                    System.out.println("1. Agregar casa");
                                    System.out.println("2. Agregar edificio");
                                    System.out.println("3. Agregar solar");
                                    System.out.println("4. Volver");
                                    System.out.println("Ingrese opcion: ");
                                    menuAgregar = leer.nextInt();

                                    switch (menuAgregar) {
                                        case 1: {
                                            registro.add(newCasa());
                                        }
                                        break;
                                        case 2: {
                                            registro.add(newEdificio());
                                        }
                                        break;
                                        case 3: {
                                            registro.add(newSolar());
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion no valida");
                                        }
                                        break;
                                    }
                                } while (menuAgregar != 4); //fin switch menuAgregar                               
                            }
                            break;
                            case 2: {
                                int menuListar = 0;
                                do {
                                    System.out.println("---LISTAR---");
                                    System.out.println("1. Listar casas");
                                    System.out.println("2. Listar edificios");
                                    System.out.println("3. Listar solares");
                                    System.out.println("4. Volver");
                                    System.out.println("Ingrese opcion: ");

                                    switch (menuListar) {
                                        case 1: {
                                            String listacasas = "";
                                            for (Object casas : registro) {
                                                if (casas instanceof casa) {
                                                    listacasas += "" + registro.indexOf(casas) + " - " + casas + "\n";
                                                }
                                            }
                                            System.out.println(listacasas);
                                        }
                                        break;
                                        case 2: {
                                            String listaedificio = "";
                                            for (Object edificio : registro) {
                                                if (edificio instanceof edificio) {
                                                    listaedificio += "" + registro.indexOf(edificio) + " - " + edificio + "\n";
                                                }
                                            }
                                            System.out.println(listaedificio);
                                        }
                                        break;
                                        case 3: {
                                            String listasolar = "";
                                            for (Object solar : registro) {
                                                if (solar instanceof edificio) {
                                                    listasolar += "" + registro.indexOf(solar) + " - " + solar + "\n";
                                                }
                                            }
                                            System.out.println(listasolar);
                                        }
                                    }
                                } while (menuListar != 4); //fin while menu listar
                            }
                        }
                    } while (op3 != 6); //fin while menu registro                    
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
                        System.out.println("3. Volver");
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
                    } //fin while menu de login
                    while (opcion != 3);
                }
            }//fin del switch

        } // fin while
        while (opcion
                != 8);
    }//fin del main

    static casa newCasa() {
        int numCasa;
        int numBloque;
        Color color;
        int Ancho;
        int Largo;
        int banos;
        int cuartos;
        casa nuevaCasa;
        System.out.println("Ingrese el numero de casa: ");
        numCasa = leer.nextInt();
        System.out.println("Ingrese el bloque de casa: ");
        numBloque = leer.nextInt();
        color = JColorChooser.showDialog(null, "Seleccione color: ", Color.black);
        System.out.println("Ingrese el ancho: ");
        Ancho = leer.nextInt();
        System.out.println("Ingrese el largo: ");
        Largo = leer.nextInt();
        System.out.println("Ingrese la cantidad de banos: ");
        banos = leer.nextInt();
        System.out.println("Ingrese el numero de cuartos: ");
        cuartos = leer.nextInt();
        nuevaCasa = new casa(numCasa, numBloque, color, Ancho, Largo, banos, cuartos);
        return nuevaCasa;
    }

    static edificio newEdificio() {
        int numPiso;
        int cantLocal;
        String direccion;
        edificio nuevoEdificio;
        System.out.println("Ingrese el numero de pisos: ");
        numPiso = leer.nextInt();
        System.out.println("Ingrese la cantidad de locales: ");
        cantLocal = leer.nextInt();
        System.out.println("Ingrese la direccion por referencia: ");
        direccion = leer.next();
        nuevoEdificio = new edificio(numPiso, cantLocal, direccion);
        return nuevoEdificio;
    }

    static solar newSolar() {
        int ancho;
        int largo;
        int area;
        solar nuevoSolar;
        System.out.println("Ingrese el ancho: ");
        ancho = leer.nextInt();
        System.out.println("Ingrese el largo: ");
        largo = leer.nextInt();
        area = ancho * largo;
        nuevoSolar = new solar(ancho, largo, area);
        return nuevoSolar;

    }
}
