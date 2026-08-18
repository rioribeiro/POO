package lista02; // Resolve o primeiro erro

import java.util.Scanner; // Resolve o segundo erro

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;
        
        System.out.println("Digite quatro valores inteiros:");
        
        for (int i = 0; i < 4; i++) {
            int num = input.nextInt();
            
            if (num % 2 == 0) {
                somaPares += num;
            } else {
                somaImpares += num;
            }
        }
        
        System.out.println("Soma dos pares = " + somaPares);
        System.out.println("Soma dos ímpares = " + somaImpares);
        
        input.close();
    }
}
