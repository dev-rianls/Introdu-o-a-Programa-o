import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao, opcaoLanche;
        double valorTotal = 0;
        String lanche;

        System.out.println("---Menu---");
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Lanches");
        System.out.println("2 - Bebidas");
        System.out.println("3 - Sobremesas");
        System.out.println("Opção: ");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("---Lanches---");
                System.out.println("1 - X-Salada = R$ 30,00");
                System.out.println("2 - X-Bacon = R$ 35,00");
                System.out.println("3 - X-Calabresa R$ 40,00");
                System.out.print("Opção de lanche: ");
                opcaoLanche = sc.nextInt();

                switch (opcaoLanche){
                    case 1:
                        lanche = "X-Salada";
                        valorTotal += 30;
                        break;

                    case 2:
                        System.out.println("Você pediu X-Bacon");
                        valorTotal += 35;
                        break;

                    case 3:
                        System.out.println("Você pediu X-Calabresa");
                        valorTotal += 40;
                        break;

                }
        }

        System.out.println("Valor Total: R$" + valorTotal);

        sc.close();
    }
}
