import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valorProduto, parcelas;

        System.out.print("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        parcelas = valorProduto /3;

        System.out.printf("O valor das parcelas são: %.2f", parcelas);

        sc.close();
    }
}
