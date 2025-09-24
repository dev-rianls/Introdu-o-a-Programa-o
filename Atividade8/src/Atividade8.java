import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double largura, altura, prof, volume;

        System.out.print("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite a profundidade: ");
        prof = sc.nextDouble();

        volume = largura * altura * prof;

        System.out.printf("O volume da caixa é: %.2f", volume);

        sc.close();
    }
}
