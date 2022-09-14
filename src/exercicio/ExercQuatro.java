package exercicio;

/*
4. Criar um programa que receba um número e diga se ele é um número primo.

 */

import java.util.Scanner;

public class ExercQuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor = 1;
        int divisor = 0;

        System.out.println("Digite um valor: ");
        int x = scan.nextInt();

        if (x > 0) {
            while (valor <= x) {
                if (x%valor == 0){
                    divisor++;
                }
                valor++;
            }
            if (divisor == 2) {
                System.out.println("O numero "+x+" e primo");
            } else {

                System.out.println("O numero "+x+" nao e primo");
            }
        } else {
            System.out.println("Valor negativo ou igual a zero");
        }

        scan.close();
    }
}
