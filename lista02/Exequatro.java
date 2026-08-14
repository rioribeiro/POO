package lista02;

import java.util.Scanner;

public class Exequatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/mm/aaaa:");
        String entrada = sc.nextLine();

        String[] partes = entrada.split("/");

        if (partes.length != 3) {
            System.out.println("A data informada não é válida");
            sc.close();
            return;
        }

        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            System.out.println("A data informada não é válida");
            sc.close();
            return;
        }

        boolean valida = true;

        // Verificar ano
        if (ano < 1900 || ano > 2100) {
            valida = false;
        }

        // Verificar mês
        if (mes < 1 || mes > 12) {
            valida = false;
        }

        // Verificar dia de acordo com o mês
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Ajuste para ano bissexto
        if (mes == 2 && ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))) {
            diasMes[1] = 29;
        }

        if (dia < 1 || dia > diasMes[mes - 1]) {
            valida = false;
        }

        if (valida) {
            System.out.println("A data informada é válida");
        } else {
            System.out.println("A data informada não é válida");
        }

        sc.close();
    }
}
