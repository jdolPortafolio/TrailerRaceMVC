/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author josed
 */
public class CarreraControlador {
private Trailer trailer1;
    private Trailer trailer2;
    private PistaVista vista;

    public CarreraControlador(Trailer trailer1, Trailer trailer2, PistaVista vista) {
        this.trailer1 = trailer1;
        this.trailer2 = trailer2;
        this.vista = vista;
    }

    public void iniciarCarrera() {
        vista.mostrarInicio();
        
        while (true) {
            trailer1.mover();
            trailer2.mover();
            vista.mostrarPista(trailer1, trailer2);

            if (trailer1.getPosicion() >= vista.getLongitudPista()) {
                vista.mostrarGanador(trailer1);
                break;
            }
            if (trailer2.getPosicion() >= vista.getLongitudPista()) {
                vista.mostrarGanador(trailer2);
                break;
            }

            try {
                Thread.sleep(1000); // Pausa de 1 segundo (antes era 500 ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
