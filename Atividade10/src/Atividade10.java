import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double massa, altura, energPot;

        System.out.print("Digite a massa: ");
        massa = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        energPot = massa * 9.8 * altura;

        System.out.printf("A energia potencial do objeto é: %.2f", energPot);

        sc.close();
    }
}
