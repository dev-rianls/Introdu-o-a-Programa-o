import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double velKMh, velMs;

        System.out.print("Digite a velocidade em KM/H: ");
        velKMh = sc.nextDouble();

        velMs = velKMh / 3.6;

        System.out.printf("A velocidade em M/S é de: %.2f", velMs);

        sc.close();
    }
}
