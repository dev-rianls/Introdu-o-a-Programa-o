import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double distKM, tempoEstimH, velMed;

        System.out.print("Digite a distância entre as cidades: ");
        distKM = sc.nextDouble();

        System.out.print("Digite o tempo estimado da viagem: ");
        tempoEstimH = sc.nextDouble();

        velMed = distKM / tempoEstimH;

        System.out.printf("A velocidade média da viagem é: %.2f Km/h", velMed);

        sc.close();
    }
}
