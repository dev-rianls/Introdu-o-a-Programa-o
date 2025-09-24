import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hr, min, seg, totalSeg;

        System.out.print("Digite a quantidade em segundos: ");

        totalSeg = sc.nextInt();

        hr = totalSeg / 3600;

        min = (totalSeg % 3600) / 60;

        seg = totalSeg % 60;

        System.out.printf("O tempo é: %dhora(s), %dminuto(s) e %dsegundo(s)", hr, min, seg);

        sc.close();
    }
}
