package lista02;

import java.util.Scanner;

public class Exercicio12 {

    public static int menorInteiro(double x) {
        return (int) Math.ceil(x);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double x = entrada.nextDouble();

        int resultado = menorInteiro(x);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}