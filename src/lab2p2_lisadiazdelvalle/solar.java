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
    private int area;
    private String dueno;
    private String estado;

    public solar() {

    }

    public solar(int largo, int ancho, int area) {
        this.ancho = ancho;
        this.largo = largo;
        this.area = area;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString() {
        return "\nSOLAR" + "\n{largo=" + largo + ", ancho=" + ancho + ", area=" + area + ", dueno=" + dueno + ", estado=" +'}';
    }
    

    

}
