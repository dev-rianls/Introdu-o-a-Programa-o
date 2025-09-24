import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, usuarioCadastrado = "admin";
        int senha, senhacadastrada = 1234;

        System.out.print("Usuário: ");
        usuario = sc.nextLine();
        System.out.print("Senha: ");
        senha = sc.nextInt();

        if (usuario.equals("admin") && (senha == 1234)) {
            System.out.print("Login realizado com sucesso");
        }else{
            System.out.println("Usuário ou senha incorreta");
        }


        sc.close();

    }
}
