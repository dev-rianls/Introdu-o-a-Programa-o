import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double litros, mililitros;

        System.out.print("Digite o valor em litros: ");
        litros = sc.nextDouble();

        mililitros = litros * 1000;

        System.out.printf("O valor em mililitros é: %.2f", mililitros);

        sc.close();
    }
}
