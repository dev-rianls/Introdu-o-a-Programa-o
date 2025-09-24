import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numX, numAnt, numProx;

        System.out.print("Digite o número inteiro: ");
        numX = sc.nextInt();

        numAnt = numX - 1;
        numProx = numX + 1;

        System.out.printf("O número anterior é: %d \n", numAnt);
        System.out.printf("O número próximo é: %d", numProx);

        sc.close();
    }
}
