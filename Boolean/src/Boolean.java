import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;
        boolean cnh;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        System.out.print("Possui CNH? ");
        cnh = sc.nextBoolean();

        if (idade >= 18 && cnh) {
            System.out.print("Maior de idade e dirige");
        }else{
            System.out.print("Ou não é maior ou não dirige");
        }

       // if (idade >= 18){
         //   System.out.print("Possui CNH? ");
           // cnh = sc.nextBoolean();

            // if (cnh){
               // System.out.println("Maior de idade e dirige");

            // }else{
               // System.out.println("Maior de idade e não dirige");
            // }

        // }else{
           // System.out.println("Menor de idade");
        // }

        sc.close();

    }
}
