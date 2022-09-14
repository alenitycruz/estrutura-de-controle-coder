package exercicio;

import java.util.Scanner;

/*
7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma
dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
 */
public class ExercSete {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int numero = 0;


        while(numero >= 0){

            soma += numero;

            if (numero <= -1){
                break;
            }
        }

        System.out.println(soma);

        scan.close();

    }
}
