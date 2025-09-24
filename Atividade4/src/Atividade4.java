import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalVendas, comissao;

        System.out.print("Digite o valor total de vendas: ");
        totalVendas = sc.nextDouble();

        comissao = ((totalVendas * 5) /100);

        System.out.printf("O valor da comissão é de: %.2f", comissao);

        sc.close();
    }
}
