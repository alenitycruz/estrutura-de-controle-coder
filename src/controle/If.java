package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = scan.nextDouble();

        if (media<=10 && media>=7.0) {

            System.out.println("Aluna aprovada!");
            System.out.println("Parabens!");
        }

        if (media<7.0 && media>=4.5) System.out.println("Recuperacao!");


        if (media<4.5 && media>=0){
            System.out.println("Reprovado!");
        }



            scan.close();
    }
}
