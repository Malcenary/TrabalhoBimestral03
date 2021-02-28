package trabalhobimestral03;
import java.util.Scanner;
public class Atv02 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        String vetorNome [] = new String [10];
        Integer vetorIdade [] = new Integer [10];
        int soma =0;
            for(int i = 0; i< 10;i++){
                System.out.print("Informe o Nome:");
                vetorNome[i] = leitura.next();
                System.out.print("Informe a Idade:");
                vetorIdade[i] = leitura.nextInt();
            }
            for(int i = 0; i < 10;i++){
                if(vetorIdade[i] > 18){
                System.out.println(vetorNome[i]);
                }
            }
            for(int i = 0; i < 10;i++){
                soma = soma + vetorIdade[i]; 
            }
            System.out.println("A média das idade é:"+soma/10);
            }
    }