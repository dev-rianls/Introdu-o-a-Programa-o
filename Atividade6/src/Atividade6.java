import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valorConta, taxaServico, valorNovo;

        System.out.print("Digite o valor da conta: ");
        valorConta = sc.nextDouble();

        taxaServico = ((valorConta *10) / 100);
        valorNovo = valorConta + taxaServico;

        System.out.printf("O valor novo com a taxa de serviço é de: %.2f", valorNovo);

        sc.close();
    }
}
