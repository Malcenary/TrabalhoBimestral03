package trabalhobimestral03;

import java.util.Scanner;

public class Atv04 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Integer vetorA[] = new Integer[5];
        Integer vetorB[] = new Integer[5];
        Integer vetorC[] = new Integer[vetorA.length + vetorB.length];
        int n = 5;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número A:");
            vetorA[i] = leitura.nextInt();
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número B:");
            vetorB[i] = leitura.nextInt();
            vetorC[n] = vetorB[i];
            n++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(vetorC[i]);
        }
        for (int c = 5; c < 10; c++) {
            System.out.println(vetorC[n]);
        }
    }
}
