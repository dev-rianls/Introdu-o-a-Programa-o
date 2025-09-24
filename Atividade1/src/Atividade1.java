import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        System.out.printf("Primeiro número e segundo número %d%d ", a, b);
    }
}
