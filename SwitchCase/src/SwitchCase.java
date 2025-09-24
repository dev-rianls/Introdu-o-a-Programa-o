import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sexo;

        System.out.print("Escolha o sexo m ou f: ");
        sexo = sc.nextLine();

        switch (sexo){
            case "m":
                System.out.println("Você escolheu masculino");
                break;
            case "f":
                System.out.println("Você escolheu feminino");
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }

        sc.close();
    }
}
