import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade, dias;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        dias = idade * 365;

        System.out.printf("A idade em dias é: %d", dias);

        sc.close();
    }
}
