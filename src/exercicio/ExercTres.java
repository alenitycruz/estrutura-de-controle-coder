package exercicio;

/*
3. Criar um programa que receba duas notas parciais, calcular a média final.
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0
e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
 */


import java.util.Scanner;

public class ExercTres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nota 1: ");
        int notaUm = scan.nextInt();

        System.out.println("Nota 2: ");
        int notaDois = scan.nextInt();

        int media = (notaUm + notaDois)/2;

        switch (media) {
            case 10: case 9: case 8: case 7:
                System.out.println("Aprovado");
                break;
            case 6: case 5: case 4:
                System.out.println("Recuperacao");
                break;
            case 3: case 2: case 1: case 0:
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota invalida!");
        }

        scan.close();

    }
}
