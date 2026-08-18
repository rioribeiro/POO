package lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int mmc(int x, int y) {
        return (x * y) / mdc(x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número positivo: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        int y = scanner.nextInt();

        int resultado = mmc(x, y);

        System.out.println("O MMC de " + x + " e " + y + " é: " + resultado);

        scanner.close();
    }
}
