/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class Usuarios {
    private String nombre;
    private int edad;
    private String user;
    private String contrasena;
    
    public Usuarios(){
        
    }
    
    public Usuarios(String nombre, int edad, String user, String contrasena){
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
   
    
}
