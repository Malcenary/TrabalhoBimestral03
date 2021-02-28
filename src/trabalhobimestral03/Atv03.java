package trabalhobimestral03;
import java.util.Scanner;
public class Atv03 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        Integer vetorA [] = new Integer [5];
        Integer vetorB [] = new Integer [5];
        Integer vetorC [] = new Integer [5];
        
        for(int i = 0; i < 5;i++){
            System.out.print("Informe o número A:");
            vetorA[i]=leitura.nextInt();
            System.out.print("Informe o número B:");
            vetorB[i]=leitura.nextInt();
        }
        for(int i = 0; i < 5;i++){
            vetorC[i] = vetorA[i]+vetorB[i];
            System.out.print(vetorC[i]+",");
        }
    }
}
