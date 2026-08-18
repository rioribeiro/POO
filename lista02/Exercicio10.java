package lista02;

public class Exercicio10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);

            for (int j = 2; j <= i; j += 2) {
                System.out.print(" " + j);
            }

            System.out.println();
        }
    }
}