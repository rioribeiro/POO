package lista02;

import java.util.Scanner;

public class Exedois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();

        String nome = null;
        String trimestre = null;

        switch (mes) {
            case 1:
                nome = "Janeiro";
                break;
            case 2:
                nome = "Fevereiro";
                break;
            case 3:
                nome = "Março";
                break;
            case 4:
                nome = "Abril";
                break;
            case 5:
                nome = "Maio";
                break;
            case 6:
                nome = "Junho";
                break;
            case 7:
                nome = "Julho";
                break;
            case 8:
                nome = "Agosto";
                break;
            case 9:
                nome = "Setembro";
                break;
            case 10:
                nome = "Outubro";
                break;
            case 11:
                nome = "Novembro";
                break;
            case 12:
                nome = "Dezembro";
                break;
            default:
                nome = null;
                break;
        }

        switch (mes) {
            case 1:
            case 2:
            case 3:
                trimestre = "1º Trimestre";
                break;
            case 4:
            case 5:
            case 6:
                trimestre = "2º Trimestre";
                break;
            case 7:
            case 8:
            case 9:
                trimestre = "3º Trimestre";
                break;
            case 10:
            case 11:
            case 12:
                trimestre = "4º Trimestre";
                break;
            default:
                trimestre = null;
                break;
        }

        if (nome != null && trimestre != null) {
            System.out.println(nome + " - " + trimestre);
        } else {
            System.out.println("Mês inválido!");
        }

        scanner.close();
    }
}
