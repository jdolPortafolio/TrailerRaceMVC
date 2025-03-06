/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author josed
 */
public class PistaVista {
private static final int LONGITUD_PISTA = 150;

    public void mostrarPista(Trailer trailer1, Trailer trailer2) {
        System.out.println("\nPISTA DE CARRERA (META EN " + LONGITUD_PISTA + ")");
        
        // Línea de inicio y meta
        StringBuilder lineaPista = new StringBuilder();
        lineaPista.append("| INICIO ").append("-".repeat(LONGITUD_PISTA - 1)).append(" META |");
        System.out.println(lineaPista);

        // Mostrar cada trailer con el diseño ASCII
        mostrarTrailer(trailer1, "Trailer Rojo");
        mostrarTrailer(trailer2, "Trailer Azul");
        
        // Línea inferior
        System.out.println("-".repeat(LONGITUD_PISTA + 10));
    }

    private void mostrarTrailer(Trailer trailer, String nombre) {
        int pos = Math.min(trailer.getPosicion(), LONGITUD_PISTA);
        String espacio = " ".repeat(pos);

        // Diseño ASCII del tráiler (5 líneas)
        String[] trailerAscii = {
            "▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▐▄──────",
            "                              ▐██▄▄───",
            "                              ▐██▌ ▐▄▄▄",
            "▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█▐███████",
            "⊙)▀▀▀▀▀▀▀▀▀▀(⊙)(⊙)▀▀▀▀▀▀▀(⊙)▀▀▀"
        };

        // Imprimir el nombre y cada línea del diseño con el desplazamiento
        System.out.println(nombre + ":");
        for (String linea : trailerAscii) {
            System.out.println(espacio + linea);
        }
    }

    public void mostrarGanador(Trailer trailer) {
        System.out.println("\n 🏁¡GANADOR: " + trailer.getNombre() + "! 🏁");
    }

    public void mostrarInicio() {
        System.out.println("🏁 ¡COMIENZA LA CARRERA DE TRÁILERS! 🏁");
    }

    public int getLongitudPista() {
        return LONGITUD_PISTA;
    }
}
