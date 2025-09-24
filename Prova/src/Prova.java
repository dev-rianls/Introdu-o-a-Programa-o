import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double valorCompra, percDesconto, percImp = 13.5, valorParc, valorFinal, jurTotal, valTotalJuros;
        double jur = 1.5;
        int numParc;

        System.out.print("Digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.print("Digite o valor total da compra: R$");
        valorCompra = sc.nextDouble();
        System.out.print("Digite o percentual de desconto:  %");
        percDesconto = sc.nextDouble();
        System.out.print("Digite o percentual de imposto:  %");
        percImp = sc.nextDouble();
        System.out.print("Digite o número de parcelas:  x");
        numParc = sc.nextInt();

        percDesconto = ((valorCompra * percDesconto) / 100);

        percImp = ((valorCompra * percImp) / 100);

        valorFinal = ((valorCompra - percDesconto) + percImp);

        valorParc = valorFinal / numParc;

        jurTotal = ((valorFinal * 0.015) * numParc);

        valTotalJuros = valorFinal + jurTotal;


        System.out.printf("Cliente: %s \n Valor da compra: R$ %.2f \n Desconto aplicado R$ %.2f \n Imposto aplicado R$ %.2f \n Valor final da compra R$ %.2f \n Parcelado em %d x \n Valor total de cada parcela (Sem juros) R$ %.2f \n Total de juros pagos R$ %.2f \n Valor total com juros R$ %.2f", nome, valorCompra, percDesconto, percImp, valorFinal, numParc, valorParc, jurTotal, valTotalJuros);


        sc.close();
    }
}
