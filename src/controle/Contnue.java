package controle;

public class Contnue {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++) {
            if (i % 2 == 1){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();

        for (int j = 0 ; j < 10 ; j++) {
            if (j == 5) {
                continue;
            }
            System.out.print(j);
        }
    }
}
