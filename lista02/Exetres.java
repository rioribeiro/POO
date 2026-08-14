package lista02;
import java.util.Arrays;
import java.util.Scanner;

public class Exetres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quatro valores inteiros: ");
        int[] valores = new int[4];
        for (int i = 0; i < 4; i++) {
            valores[i] = scanner.nextInt();
        }
        boolean valorUnico = false;
        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] == valores[j]) {
                    valorUnico = true;
                    break;
                }
            }
        }
        if (valorUnico) {
            System.out.println("Erro: os valores devem ser diferentes.");
        } else {
            Arrays.sort(valores);
            int menor = valores[0];
            int segundoMenor = valores[1];
            int segundoMaior = valores[2];
            int maior = valores[3];
            for (int i = 1; i < valores.length; i++) {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
                if (valores[i] < menor) {
                    menor = valores[i];
                }
            }
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.print("A soma do segundo maior e do segundo menor valor é = " + (segundoMaior + segundoMenor));
        }

        scanner.close();
    }
}
