import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min, seg;

        System.out.print("Qual o tempo em minutos: ");
        min = sc.nextInt();

        seg = min * 60;

        System.out.printf("O tempo em segundos é de: %d", seg);

        sc.close();
    }
}
