import java.util.Scanner;

public class ValorCompra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorCompra;

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = sc.nextDouble();

        valorCompra = (valorCompra > 100) ? valorCompra - 10 : valorCompra;

        System.out.printf("O valor total é de R$ %.2f", valorCompra);

        sc.close();
    }
}
