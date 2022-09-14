package exercicio;

/*
1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */

import java.util.Scanner;

public class ExercUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        int numero = scan.nextInt();

        if (numero%2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        scan.close();
    }
}
