import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        String nome;

        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) { //7, 8, 9, 10
            System.out.printf("%s está aprovado", nome);

        } else if (media >= 5) { //5, 6
            System.out.printf("%s está em recuperação", nome);

        }else{
            System.out.printf("%s está reprovado", nome);

        }

        sc.close();
    }
}