import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temperaturaC, temperaturaF;

        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaC = sc.nextDouble();

        temperaturaF = (temperaturaC * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f", temperaturaF);

        sc.close();
    }
}
