/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

/**
 *
 * @author HTS
 */
public class solar {
    private int largo;
    private int ancho;
    
    public solar(){
        
    }
    public solar(int largo, int ancho){
        this.ancho=ancho;
        this.largo=largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "solar{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }
    
}
