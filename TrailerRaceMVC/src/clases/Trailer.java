/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author josed
 */
// Modelo (Trailer.java)
public class Trailer {
private String nombre;
    private int posicion;
    private int velocidadMaxima;

    public Trailer(String nombre, int velocidadMaxima) {
        this.nombre = nombre;
        this.posicion = 0;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mover() {
        int avance = (int) (Math.random() * velocidadMaxima) + 1;
        posicion += avance;
    }

    public String getNombre() { return nombre; }
    public int getPosicion() { return posicion; }
}