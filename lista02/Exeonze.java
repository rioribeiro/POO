package lista02;

import java.util.Scanner;

public class Exeonze {

    public static double calcularDiagonal(double base, double altura) {
        return Math.sqrt(base * base + altura * altura);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double b = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        double h = entrada.nextDouble();

        double diagonal = calcularDiagonal(b, h);

        System.out.println("Diagonal = " + diagonal);

        entrada.close();
    }
}