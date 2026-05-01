import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin("Admin", "Admin@gmail", "Admin123");

        while (true) {
            System.out.println("1 - Cadastrar médico");
            System.out.println("2 - Listar médicos");
            System.out.println("0 - Sair");
            System.out.println("qual opçao:");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:

                    System.out.println("Cadastrar medico");
                    sc.nextLine();
                    System.out.println("Nome");
                    String nome = sc.nextLine();

                    System.out.println("Email");
                    String email = sc.nextLine();

                    System.out.println("Senha");
                    String senha = sc.nextLine();

                    System.out.println("Especialidade");
                    String especialidade = sc.nextLine();

                    System.out.println("Crm");
                    String crm = sc.nextLine();
                    Medico medico = new Medico(nome, email, senha, crm, especialidade);
                    admin.cadastrarMedico(medico);
                    break;

                case 2:
                    System.out.println("lista de medicos: ");
                    admin.listarMedicos();
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    return;
                default:
                    System.out.println("opçao invalida");
            }

        }
    }
}
