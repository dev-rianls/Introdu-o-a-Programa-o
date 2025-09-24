import java.util.Scanner;

public class Rodoviária {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String horarioDisp = "0", nomeDest = " ", horarioEsc = "0";
        int destino, idade;
        double valorPassagem = 0, porcentDesc, valorDesc, valorFinal;

        System.out.println("Escolha seu destino: ");
        System.out.println("1 - Florianópolis: R$ 75,00");
        System.out.println("2 - Porto Alegre: R$ 120,00");
        System.out.println("3 - Curitiba: R$ 150,00");
        System.out.println("4 - São Paulo: R$ 180,00");
        System.out.println("5 - Rio de Janeiro: R$ 220,00");
        System.out.println("6 - Belo Horizonte: R$ 200,00");

        destino = sc.nextInt();
        sc.nextLine();

        switch (destino){
            case 1:
                valorPassagem = 75.00;
                System.out.println("Horários disponíveis para Florianópolis");
                nomeDest = "Florianópolis";
                System.out.println("08:00, 14:00, 18:00");
                horarioDisp = "08:00 14:00 18:00";

                break;
            case 2:
                valorPassagem = 120.00;
                System.out.println("Horários disponíveis para Porto Alegre");
                nomeDest = "Porto Alegre";
                System.out.println("07:30, 13:30, 20:00");
                horarioDisp = "07:30 13:30 20:00";
                break;
            case 3:
                valorPassagem = 150.00;
                System.out.println("Horários disponíveis para Curitiba");
                nomeDest = "Curitiba";
                System.out.println("06:00, 12:00, 22:00");
                horarioDisp = "06:00 12:00 22:00";
                break;
            case 4:
                valorPassagem = 180.00;
                System.out.println("Horários disponíveis para São Paulo");
                nomeDest = "São Paulo";
                System.out.println("05:00, 11:00, 17:00, 23:00");
                horarioDisp = "05:00 11:00 17:00 23:00";
                break;
            case 5:
                valorPassagem = 220.00;
                horarioDisp = "06:30 13:00 19:00";
                nomeDest = "Rio de Janeiro";
                System.out.println("Horários disponíveis para Rio de Janeiro");

                System.out.println("06:30, 13:00, 19:00");

                break;
            case 6:
                valorPassagem = 200.00;
                System.out.println("Horários disponíveis para Belo Horizonte");
                nomeDest = "Belo Horizonte";
                System.out.println("09:00, 15:00, 21:00");
                horarioDisp = "09:00 15:00 21:00";
                break;

        }

        if (valorPassagem != 0){
            System.out.println("Qual horário você pretende viajar? ");
            horarioEsc = sc.nextLine();

            if (horarioDisp.contains(horarioEsc)) {
                System.out.print("Digite sua idade: ");
                idade = sc.nextInt();

                if (idade <= 6) {
                    porcentDesc = 100;
                } else if (idade >= 6 && idade <= 17) {
                    porcentDesc = 50;
                } else if (idade >= 60) {
                    porcentDesc = 30;
                } else {
                    porcentDesc = 0;
                }

                valorFinal = valorPassagem - (valorPassagem * porcentDesc / 100);

                System.out.println("--- Bilhete Rodoviário ---");
                System.out.printf("Destino: %s          Horário: %s \n", nomeDest, horarioEsc);
                System.out.printf("idade: %d \n", idade);
                System.out.printf("Desconto: %.2f%% \n", porcentDesc);
                System.out.printf("Valor final: R$ %.2f \n", valorFinal);
                System.out.println("-------------------------------------");
                System.out.println("Boa viagem!");
            }else{
                System.out.println("Você inseriu um horário indisponível");
            }

        }else{
            System.out.println("Você inseriu um código inválido");
        }

        sc.close();
    }
}
