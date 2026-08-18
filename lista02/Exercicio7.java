package lista02;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        // Quebra a frase em palavras
        String[] palavras = frase.split(" ");

        // Imprime removendo uma palavra do início a cada vez
        for (int i = 0; i < palavras.length; i++) {
            for (int j = i; j < palavras.length; j++) {
                System.out.print(palavras[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

