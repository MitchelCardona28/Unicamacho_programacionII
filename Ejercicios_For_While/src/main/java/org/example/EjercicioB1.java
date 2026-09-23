package org.example;

import java.util.Scanner;

public class EjercicioB1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dígito del radicado: ");
        long numero = sc.nextLong();

        if (numero < 0) {
            System.out.println("El radicado no es valido. Ingrese un numero positivo.");
            return;
        }

        long original = numero;
        int sumDigitos = 0;
        int maxDigito = 0;
        int cantDigitos = 0;
        long invertido = 0;

        // Manejo especial si el número ingresado es 0
        if (numero == 0) {
            cantDigitos = 1;
        } else {
            // Proceso de iterativo usando solo % y /
            while (numero > 0) {
                int digito = (int) (numero % 10); // Extraemos el último número
                sumDigitos += digito;
                cantDigitos++;

                if (digito > maxDigito) {
                    maxDigito = digito;
                }

                invertido = invertido * 10 + digito; // Construimos el numero invertido
                numero /= 10; // Eliminamos el último dígito
            }
        }

        boolean esCapicua = (original == invertido);

        // Resultados
        System.out.println("\n--- RESULTADOS DE LA VALIDACIÓN ---");
        System.out.println("Cantidad de dígitos: " + cantDigitos);
        System.out.println("Suma de sus dígitos: " + sumDigitos);
        System.out.println("Dígito mayor: " + maxDigito);
        System.out.println("¿Es capicúa?: " + (esCapicua ? "Sí" : "No"));
    }
}
