import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalCompra, numPessoas, divisaoTotal;

        System.out.print("Digite o valor total da compra: ");
        totalCompra = sc.nextDouble();
        System.out.print("Digite o número de pessoas: ");
        numPessoas = sc.nextDouble();

        divisaoTotal =totalCompra / numPessoas;

        System.out.printf("O valor dividido por pessoa é de: %.2f", divisaoTotal);

        sc.close();
    }
}
