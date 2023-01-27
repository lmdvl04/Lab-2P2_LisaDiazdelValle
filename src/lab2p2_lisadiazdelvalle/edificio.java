/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class edificio {
    private int pisos;
    private int cantLocales;
    private String direccion;
    
    public edificio (){
        
    }
    public edificio(int pisos, int cantLocales, String direccion){
        this.pisos=pisos;
        this.cantLocales=cantLocales;
        this.direccion=direccion;        
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getCantLocales() {
        return cantLocales;
    }

    public void setCantLocales(int cantLocales) {
        this.cantLocales = cantLocales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "edificio{" + "pisos=" + pisos + ", cantLocales=" + cantLocales + ", direccion=" + direccion + '}';
    }
    
    
}

