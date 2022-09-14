package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = "";

        do{
            System.out.println("Qual o nome da palavra magica?");
            texto = scan.nextLine();
        } while (!texto.equalsIgnoreCase("abracadabra"));

        System.out.println("Obrigada");

        scan.close();
    }
}
