import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome, senha;
        int anoNascimento;

        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o ano do nascimento: ");
        anoNascimento = sc.nextInt();

        System.out.printf("A senha é: %s@%d", nome, anoNascimento);

        sc.close();
    }
}
