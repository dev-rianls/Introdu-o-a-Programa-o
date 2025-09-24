import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("Digite um número: ");

        num = sc.nextDouble();

        if (num%2 == 0) {
            System.out.println("Número par");

        }else{
            System.out.println("Número ímpar");
        }


        sc.close();
    }
}
