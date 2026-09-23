package org.example;

public class EjercicioB2 {
    static void main(String[] args) {
        String[] identificaciones = {"1234", "8542", "1234", "8964", "4343"};

        String repetido = "";
        int pos1 = 0;
        int pos2 = 0;
        boolean esDuplicado = false; // Bandera de control para duplicados

        for (int i = 0; i < identificaciones.length; i++) {
            for (int j = i + 1; j < identificaciones.length; j++) { // j aumentado en 1 para recorrer los índices restantes
                if (identificaciones[i].equals(identificaciones[j])) {
                    repetido = identificaciones[j];
                    pos1 = i; // Posisión del documento evaluado
                    pos2 = j; // Posición del documento repetido
                    esDuplicado = true;
                    break; // Se cancela la búsqueda
                }
            }
        }

        if (esDuplicado) {
            System.out.println("El documento repetido es " +  repetido + " y se encuentra en las posiciones " + pos1 + " y " + pos2 + ".");
        } else {
            System.out.println("No se encontraron números duplicados");
        }
    }
}
