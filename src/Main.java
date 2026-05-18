import model.Medico;
import model.Admin;
import model.Paciente;
import model.Usuario;
import service.login.Autenticador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Autenticador autenticador = new Autenticador("admin", "Admin123");
        Admin admin = new Admin("Admin", "Admin@gmail", "Admin123");
        Medico medicoSelecionado = null;

        System.out.println("=== BEM-VINDO AO MEDFLOW ===");
        System.out.print("Digite o usuário: ");
        String usuarioDigitado = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();


        if (!autenticador.autenticar(usuarioDigitado, senhaDigitada)) {
            System.out.println("\nErro: Usuário ou senha incorretos! Acesso negado.");
            sc.close();
            return;
        }
        System.out.println("\nLogin realizado com sucesso!");
        System.out.println("teste");


        while (true) {
            System.out.println("1 - Cadastrar médico");
            System.out.println("2 - Listar médicos");
            System.out.println("3 - Escolha o medico");
            System.out.println("4 - usar médico (cadastrar paciente)");
            System.out.println("5 - lista de pacientes:");
            System.out.println("0 - Sair");
            System.out.println("qual opçao:");

            String menu = sc.nextLine();


            switch (menu) {
                case "1":

                    System.out.println("Cadastrar medico");
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

                case "2":
                    System.out.println("lista de medicos: ");
                    admin.listarMedicos();
                    break;

                case "3":
                    System.out.println("Escolha um medico:");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    Medico medicoEscolhido;
                    medicoEscolhido = admin.getMedico(escolha);
                    medicoSelecionado = admin.getMedico(escolha);
                    if (medicoEscolhido == null) {
                        System.out.println("Escolha invalida");
                    } else {
                        System.out.println(medicoEscolhido);
                    }
                    break;

                case "4":
                    if (medicoSelecionado == null) {
                        System.out.println("Selecione um médico primeiro!");
                        break;
                    }
                    System.out.println("Nome do paciente:");
                    String nomePaciente = sc.nextLine();

                    System.out.println("Idade:");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Histórico:");
                    String historico = sc.nextLine();

                    Paciente paciente = new Paciente(nomePaciente, idade, historico);
                    medicoSelecionado.cadastrarPaciente(paciente);

                    System.out.println("Paciente cadastrado com sucesso!");
                    break;

                case "5":
                    if (medicoSelecionado == null){
                        System.out.println("medico nao selecionado");
                    }else {
                        System.out.println("Listando pacientes do médico: Dr."+ medicoSelecionado);
                    medicoSelecionado.listarPacientes();
                    }
                    break;

                case "0":
                    System.out.println("Programa encerrado");
                    return;
                default:
                    System.out.println("opçao invalida");

            }
        }
    }
}
