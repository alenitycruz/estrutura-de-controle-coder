package controle;

public class ForTres {
    public static void main(String[] args) {
        int i = 0;
        for(; i < 5 ; i++) {
            System.out.println(i);
        }


        System.out.println("Saiu do FOR...");
        System.out.println(i);


        for(int x = 0; x<5 ; x++){
            for (int y = 0; y<5;y++){
                System.out.printf("[%d %d]", x, y);
            }
            System.out.println();
        }
    }
}
