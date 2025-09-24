import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número de 0 a 10: ");

        num = sc.nextInt();

        if (num >10){
            System.out.println("Digite um número menor ou igual que 10 ");
            return;

        }

        if (num <0){
            System.out.println("Digite um número maior ou igual que 0 ");
            return;

        }

        if (num >= 5) {
            System.out.println("Número maior ou igual a 5");

        } else {
            System.out.println("Número menor a 5");
        }

        sc.close();
    }
}