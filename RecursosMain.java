package com.mycompany.practica2;

import java.util.List;

/**
 * Clase principal para probar los métodos de la clase Recursos.
 */
public class RecursosMain {

    public static void main(String[] args) {
        // Instanciar la clase Recursos
        Recursos recursos = new Recursos();

        // Llamar al método obtenerMensaje
        String mensaje = recursos.obtenerMensaje();
        System.out.println("Mensaje: " + mensaje);

        // Llamar al método verificarEdad con diferentes valores
        System.out.println("Verificación de edad para 20 años: " + recursos.verificarEdad(20));
        System.out.println("Verificación de edad para 22 años: " + recursos.verificarEdad(22));

        // Llamar al método multiplicar
        int resultadoMultiplicacion = recursos.multiplicar(7, 5);
        System.out.println("Multiplicación de 7 x 5: " + resultadoMultiplicacion);

        // Llamar al método generarLista
        List<Integer> listaNumeros = recursos.generarLista(10);
        System.out.println("Lista generada hasta 10: " + listaNumeros);
    }
}
