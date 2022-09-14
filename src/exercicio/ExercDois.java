package exercicio;

/*
2. Criar um programa informa se o ano atual é um ano bissexto;

 */

import java.util.Scanner;

public class ExercDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano no formato yyyy: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Ano Bissexto!");
        } else {
            System.out.println("O ano nao Bissexto.");
        }

        scan.close();
    }
}
