package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int nota = 0;
        int total = 0;

        do {

            System.out.println("Informe a nota ou -1 p/ sair: ");
            nota = scan.nextInt();
            if (nota <=10 && nota >=0) {
                total += nota;
                cont++;
            }

        }while(nota != -1);

        System.out.println("Soma total das notas digitadas: " + total);

        System.out.printf("As notas foram digitadas %d vezes", cont);

        System.out.println("\nMedia das notas " + (total/cont));

        scan.close();
    }
}
