package trabalhobimestral03;
import java.util.Scanner;
public class Atv01 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        Double vetor [] = new Double [10];
        
        System.out.println("Informe o salário minimo:");
        double salMin = leitura.nextDouble();
        
        for(int i = 0; i< 10;i++){
            System.out.println("Informe o salário:");
            vetor[i] = leitura.nextDouble();    
        } 
        double salario = 0;
        for(int i = 0; i< 10;i++){
            if(vetor[i] < salMin+salMin){
                salario++;
            }
        }
        System.out.println(salario+" Pessoas recebem menos que dois salários minimos.");
    }
}
