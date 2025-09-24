import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Digite o tamanho da base: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f", area);

        sc.close();
    }
}
