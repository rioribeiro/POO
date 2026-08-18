package lista02;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        String atual = frase;

        do {
            System.out.println(atual);
            atual = atual.substring(1) + atual.charAt(0);
        } while (!atual.equals(frase));

        System.out.println(frase);

        entrada.close();
    }
}