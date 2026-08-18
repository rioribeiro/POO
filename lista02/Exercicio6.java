package lista02;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dois números: início e fim.");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        int posicao = 1; // começa na primeira posição

        for (int i = inicio; i <= fim; i++) {
            if (posicao % 2 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
            posicao++;
        }
        sc.close();
    }
}
