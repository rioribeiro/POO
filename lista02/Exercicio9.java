package lista02;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            for (int i = palavra.length() - 1; i >= 0; i--) {
                System.out.print(palavra.charAt(i));
            }
            System.out.println();
        }

        entrada.close();
    }
}