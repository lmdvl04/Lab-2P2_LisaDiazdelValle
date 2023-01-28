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
        ArrayList<Usuarios> user = new ArrayList();
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
                                    menuListar = leer.nextInt();

                                    switch (menuListar) {
                                        case 1: {
                                            String listacasas = "";
                                            for (Object casas : registro) {
                                                if (casas instanceof casa) {
                                                    listacasas += "" + registro.indexOf(casas) + " : " + casas + "\n";
                                                }
                                            }
                                            System.out.println(listacasas);
                                        }
                                        break;
                                        case 2: {
                                            String listaedificio = "";
                                            for (Object edificio : registro) {
                                                if (edificio instanceof edificio) {
                                                    listaedificio += "" + registro.indexOf(edificio) + " : " + edificio + "\n";
                                                }
                                            }
                                            System.out.println(listaedificio);
                                        }
                                        break;
                                        case 3: {
                                            String listasolar = "";
                                            for (Object solar : registro) {
                                                if (solar instanceof solar) {
                                                    listasolar += "" + registro.indexOf(solar) + " : " + solar + "\n";
                                                }
                                            }
                                            System.out.println(listasolar);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion no valida");
                                        }
                                        break;
                                    }
                                } while (menuListar != 4); //fin while menu listar
                            }
                            break;
                            case 3: {
                                int menuModificar = 0;
                                do {
                                    System.out.println("---MODIFICAR---");
                                    System.out.println("1. Modificar casas");
                                    System.out.println("2. Modificar edificios");
                                    System.out.println("3. Modificar solares");
                                    System.out.println("4. Volver");
                                    System.out.println("Ingrese opcion: ");
                                    menuModificar = leer.nextInt();

                                    switch (menuModificar) {
                                        case 1: {
                                            int menuMod = 0;
                                            System.out.println(registro);
                                            System.out.println("Posicion a modificar: ");
                                            int posicion = leer.nextInt();
                                            do {
                                                System.out.println("---QUE QUIERE MODIFICAR?---");
                                                System.out.println("1. Numera de casa");
                                                System.out.println("2. Numero de bloque");
                                                System.out.println("3. Color");
                                                System.out.println("4. Ancho");
                                                System.out.println("5. Largo");
                                                System.out.println("6. Banos");
                                                System.out.println("7. Cuartos");
                                                System.out.println("8. Volver");
                                                System.out.println("Elija la opcion: ");
                                                menuMod = leer.nextInt();

                                                switch (menuMod) {
                                                    case 1: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo numero de la casa");
                                                                int newnum = leer.nextInt();
                                                                ((casa) registro.get(posicion)).setNumcasa(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");

                                                            }
                                                        }
                                                    }
                                                    break;

                                                    case 2: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo numero de bloque");
                                                                int newnum = leer.nextInt();
                                                                ((casa) registro.get(posicion)).setBloque(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 3: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                ((casa) registro.get(posicion)).setColor(JColorChooser.showDialog(null, "Selecciona color", ((casa) registro.get(posicion)).getColor()));
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 4: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo ancho");
                                                                int newnum = leer.nextInt();
                                                                ((casa) registro.get(posicion)).setAncho(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 5: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo largo");
                                                                int newnum = leer.nextInt();
                                                                ((casa) registro.get(posicion)).setLargo(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 6: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo numero de banos");
                                                                int newnum = leer.nextInt();
                                                                ((casa) registro.get(posicion)).setBanos(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 7: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo numero de cuartos");
                                                                int newnum = leer.nextInt();
                                                                ((casa) registro.get(posicion)).setCuartos(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }

                                                }

                                            } while (menuMod != 8);//fin while menu que quiere modificar casa
                                        }
                                        break;
                                        case 2: {
                                            int menuMod = 0;
                                            System.out.println(registro);
                                            System.out.println("Posicion a modificar: ");
                                            int posicion = leer.nextInt();
                                            do {
                                                System.out.println("---QUE QUIERE MODIFICAR?---");
                                                System.out.println("1. Numera de pisos");
                                                System.out.println("2. Cantidad de locales");
                                                System.out.println("3. Dirreccion por referencia");
                                                System.out.println("4. Volver");
                                                System.out.println("Elija la opcion: ");
                                                menuMod = leer.nextInt();

                                                switch (menuMod) {
                                                    case 1: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof edificio && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo numero de pisos");
                                                                int newnum = leer.nextInt();
                                                                ((edificio) registro.get(posicion)).setPisos(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 2: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof edificio && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese la nuevan cantidad de locales");
                                                                int newnum = leer.nextInt();
                                                                ((edificio) registro.get(posicion)).setCantLocales(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 3: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof edificio && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese la nuevan direccion");
                                                                int newnum = leer.nextInt();
                                                                ((edificio) registro.get(posicion)).setCantLocales(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                            } while (menuMod != 4);//fin menu que quiere edificio
                                        }
                                        break;
                                        case 3: {
                                            int menuMod = 0;
                                            System.out.println(registro);
                                            System.out.println("Posicion a modificar: ");
                                            int posicion = leer.nextInt();
                                            do {
                                                System.out.println("---QUE QUIERE MODIFICAR?---");
                                                System.out.println("1. Ancho");
                                                System.out.println("2. Largo");
                                                System.out.println("3. Volver");
                                                System.out.println("Elija la opcion: ");
                                                menuMod = leer.nextInt();

                                                switch (menuMod) {
                                                    case 1: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof solar && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo ancho");
                                                                int newnum = leer.nextInt();
                                                                ((solar) registro.get(posicion)).setAncho(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 2: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof solar && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese el nuevo largo");
                                                                int newnum = leer.nextInt();
                                                                ((solar) registro.get(posicion)).setLargo(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    case 3: {
                                                        if (posicion >= 0 & posicion < registro.size()) {
                                                            if (registro.get(posicion) instanceof edificio && posicion >= 0 && posicion < registro.size()) {
                                                                System.out.println("Ingrese la nuevan direccion");
                                                                int newnum = leer.nextInt();
                                                                ((edificio) registro.get(posicion)).setCantLocales(newnum);
                                                            } else {
                                                                System.out.println("La posicion entregada no es valida");
                                                            }
                                                        }
                                                    }
                                                    break;

                                                }
                                            } while (menuMod != 4);//fin menu que quiere solar
                                        }
                                        break;
                                    }

                                } while (menuModificar != 4);//fin while menu modificar
                            }
                            break;
                            case 4: {
                                System.out.println(registro);
                                System.out.println("Que posicion quiere eliminar: ");
                                int posicion = leer.nextInt();
                                if (posicion < registro.size() && posicion >= 0) {
                                    registro.remove(posicion);
                                }
                            }
                            break;
                            case 5:{
                                System.out.println(registro);
                                System.out.println("Que posicion quiere comprar: ");
                                int posicion = leer.nextInt();
                                if (posicion < registro.size() && posicion >= 0) {
                                    //registro.add(user.get());
                                }
                                
                            }
                        }
                    } while (op3 != 6); //fin while menu registro                    
                }
                break;

                case 2: {
                    System.out.println("---MANEJO DE ESTADOS---");
                    System.out.println(registro);
                    System.out.println("Elija la posicion para asignarle un estado");
                    int posicion = leer.nextInt();
                    String estado;
                    if (posicion >= 0 & posicion < registro.size()) {
                        if (registro.get(posicion) instanceof casa && posicion >= 0 && posicion < registro.size()) {
                            System.out.println("Ingrese el estado que desea asignarle [Lista, En Construccion, Construccion en espera, En espera de demolicion]: ");
                            estado = leer.next();
                            ((casa) registro.get(posicion)).setEstado(estado);
                        } else if (registro.get(posicion) instanceof edificio && posicion >= 0 && posicion < registro.size()) {
                            System.out.println("Ingrese el estado que desea asignarle [Lista, En Construccion, Construccion en espera, En espera de demolicion]: ");
                            estado = leer.next();
                            ((edificio) registro.get(posicion)).setEstado(estado);
                        } else if (registro.get(posicion) instanceof solar && posicion >= 0 && posicion < registro.size()) {
                            System.out.println("Ingrese el estado que desea asignarle [Lista, En Construccion, Construccion en espera, En espera de demolicion]: ");
                            estado = leer.next();
                            ((solar) registro.get(posicion)).setEstado(estado);

                        }
                    }

                }
                break;

                case 3: {

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
                                String username = leer.next();
                                System.out.println("Ingrese su pass: ");
                                String pass = leer.next();
                                boolean Found = false;
                                for (int i = 0; i < user.size(); i++) {
                                    if (user.get(i).getUser().equals(username) && user.get(i).getContrasena().equals(pass)) {
                                        Found = true;
                                    }
                                }

                            }

                            break;

                            case 2: {
                                System.out.println("Ingrese su nombre: ");
                                String nombre = leer.next();
                                System.out.println("Ingrese su edad: ");
                                int edad = leer.nextInt();
                                System.out.println("Cree un  username: ");
                                String username = leer.next();
                                System.out.println("Cree un password: ");
                                String pass = leer.next();
                                Usuarios u = new Usuarios(nombre, edad, username, pass);

                                user.add(u);
                            }
                            break;
                         
                        }
                    } //fin while menu de login
                    while (opcion != 3);
                }
            }//fin del switch

        } // fin while
        while (opcion != 4);
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
        System.out.println("Ingrese el color: ");
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
