import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, hipoten;

        System.out.print("Digite o valor do primeiro cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipoten = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);

        System.out.printf("O valor da hipotenusa é: %.2f", hipoten);

        sc.close();
    }
}
