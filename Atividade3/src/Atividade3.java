import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double produto, desconto, valorDesconto;

        System.out.print("Digite o valor do produto: ");
        produto = sc.nextDouble();
        System.out.print("Digite o % de desconto: ");
        desconto = sc.nextDouble();

        valorDesconto = produto - ((desconto*produto)/100);

        System.out.printf("O valor do desconto é de: %.2f", valorDesconto);
    }

}
