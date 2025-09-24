import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double tamanhoMB, velMbps, tempoDownload;

        System.out.print("Digite o tamanho do arquivo em MB: ");
        tamanhoMB = sc.nextDouble();
        System.out.print("Digite a velocidade da internet em Mbps: ");
        velMbps = sc.nextDouble();

        tempoDownload = (tamanhoMB * 8) / velMbps;

        System.out.printf("O tempo de download do arquivo é de %.2f segundos", tempoDownload);

        sc.close();
    }
}
