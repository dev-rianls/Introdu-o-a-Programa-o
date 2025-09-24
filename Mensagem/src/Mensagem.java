import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mensagem;
        int idade;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        mensagem = (idade >=18) ? "Maior de idade" : "Menor de idade";

        System.out.println(mensagem);


        sc.close();
    }
}
