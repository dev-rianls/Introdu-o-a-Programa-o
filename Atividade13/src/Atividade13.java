import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio, area;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.2f", area);

        sc.close();
    }
}
