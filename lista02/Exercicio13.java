package lista02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        String resultado = frase.trim().replaceAll("\\s+", " ");

        System.out.println("Frase original: [" + frase + "]");
        System.out.println("Frase tratada: [" + resultado + "]");
        entrada.close();

    }
}
