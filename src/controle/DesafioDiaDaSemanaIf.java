package controle;

import java.util.Scanner;

public class DesafioDiaDaSemanaIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dia da Semana: ");
        String semana = scan.nextLine();

        if (semana.equalsIgnoreCase("Domingo")){
            System.out.println("1");
        }else if (semana.equalsIgnoreCase("Segunda")){
            System.out.println("2");
        }else if (semana.equalsIgnoreCase("Terca")){
            System.out.println("3");
        }else if (semana.equalsIgnoreCase("Quarta")){
            System.out.println("4");
        }else if (semana.equalsIgnoreCase("Quinta")){
            System.out.println("5");
        }else if (semana.equalsIgnoreCase("Sexta")){
            System.out.println("6");
        }else if (semana.equalsIgnoreCase("Sabado")){
            System.out.println("7");
        } else {
            System.out.println("Dia invalido!");
        }

        System.out.println("Fim!");
        scan.close();
    }
}
