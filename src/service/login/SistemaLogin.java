package service.login;

import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       Autenticador usuarioSistema = new Autenticador("admin", "123");

        System.out.println("=== SISTEMA DE LOGIN ===");

        System.out.print("Digite o usuário: ");
        String loginDigitado = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        System.out.println("------------------------");

        if (usuarioSistema.autenticar(loginDigitado, senhaDigitada)) {
            System.out.println("Login realizado com sucesso! Bem-vindo ao sistema MedFlow.");
        } else {
            System.out.println("Erro: Usuário ou senha incorretos.");
        }


        scanner.close();
    }
}