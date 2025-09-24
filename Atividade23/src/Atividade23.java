import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valorCompra, troco;

        System.out.print("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        troco = 100 - valorCompra;

        System.out.printf("O troco é: %.2f reais", troco);

        sc.close();
    }
}
