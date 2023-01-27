/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_lisadiazdelvalle;

import java.awt.Color;

/**
 *
 * @author HTS
 */
public class casa {
    private int numcasa;
    private int bloque;
    private Color color;
    private int ancho;
    private int largo;
    private int banos;
    private int cuartos;
    
    public casa(){
        
    }
    public casa(int numcasa, int bloque, Color color, int ancho, int largo, int banos, int cuartos){
        this.numcasa = numcasa;
        this.bloque= bloque;
        this.color= color;
        this.ancho=ancho;
        this.largo=largo;
        this.banos=banos;
        this.cuartos=cuartos;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }
    
    
}
