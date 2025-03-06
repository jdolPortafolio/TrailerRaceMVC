/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trailerracemvc;

import clases.CarreraControlador;
import clases.PistaVista;
import clases.Trailer;

/**
 *
 * @author josed
 */
public class TrailerRaceMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trailer trailer1 = new Trailer("Trailer Rojo", 6);
        Trailer trailer2 = new Trailer("Trailer Azul", 6);
        PistaVista vista = new PistaVista();
        CarreraControlador controlador = new CarreraControlador(trailer1, trailer2, vista);

        
        
        controlador.iniciarCarrera();
    }
    
}
