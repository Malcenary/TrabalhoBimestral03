package trabalhobimestral03;
import java.util.Scanner;
public class Atv05 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        Integer vetorMatricula[] = new Integer[5];
        String vetorNome[] = new String[5];
        Integer vetorIdade[] = new Integer[5];
        Double vetorNota[] = new Double[5];
        double mediaIdade =0;
        int mediaBaixa = 1;
        int maiorNota = 0;
        Double maior = -1.0 ;
        String notaMaior = "";
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a Matricula:");
            vetorMatricula[i]=leitura.nextInt();
            System.out.print("Informe o Nome:");
            vetorNome[i]=leitura.next();
            System.out.print("Informe a Idade:");
            vetorIdade[i]=leitura.nextInt();
            System.out.print("Informe a Nota final:");
            vetorNota[i]=leitura.nextDouble();
        }System.out.println("------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetorNome[i]+" com nota de:"+vetorNota[i]);
        }System.out.println("------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            mediaIdade = mediaIdade+vetorIdade[i];
        }System.out.println("A media das idades é de:"+mediaIdade/5+" anos");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            if(vetorNota[i] > 90){
                System.out.println(vetorNome[i]+" tem a nota acima de 90.");
            }
            if(vetorNota[i] < 70){
                mediaBaixa++;
            }
            if(vetorNota[i] > maior ){
                maior = vetorNota[i];
                notaMaior = vetorNome[i];
            }
        }System.out.println("------------------------------------------------");
        System.out.println(mediaBaixa+" alunos reporovaram");
        System.out.println("------------------------------------------------");
        System.out.println("O "+notaMaior+" tem a maior nota");
    }
}
