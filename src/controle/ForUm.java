package controle;

public class ForUm {
    public static void main(String[] args) {
        for (int contador = 0 ; contador < 20 ; contador+=2){
            System.out.printf("i = %d\n", contador);
        }

        int i = 0;
        for (; i<5;){
            System.out.print(i);
            i++;
        }
    }
}
