package controle;

import java.util.Scanner;

public class WhileDesafioUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja continuar a operacao? [s/n]");
        String resposta = scan.nextLine();

        while(resposta.equalsIgnoreCase("s")) {
            System.out.println("Deseja continuar a operacao? [s/n]");
            resposta = scan.nextLine();

        }

        scan.close();
    }
}
