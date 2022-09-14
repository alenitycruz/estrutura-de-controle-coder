package exercicio;

import java.util.Scanner;

/*
8. Criar um programa que receba uma palavra e imprime no console letra por letra.
 */
public class ExercOito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0 ; i < letras.length ; i++){
            System.out.println(letras[i]);
        }

        String saudacao = "Boa noite";
        char word[] = saudacao.toCharArray();
        for (int j = 0 ; j < word.length ; j++){
            System.out.println(word[j]);
        }

    }
}
