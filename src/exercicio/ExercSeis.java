package exercicio;

/*
6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
 O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima
 a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número
 armazenado.

 */

import java.util.Scanner;

public class ExercSeis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double jogo = Math.random()*100.0;

        for (int i = 0 ; i <= 10 ; i++){
            System.out.println("Numero: ");
            double numero = scan.nextDouble();

            if (numero > jogo) {
                System.out.println("O numero e maior que o proposto");
            } else if (numero < jogo) {
                System.out.println("O numero e menor que o proposto");
            } else{
                System.out.println("Numero invalido");
            }

        }
        System.out.println(jogo);

        scan.close();
    }
}
