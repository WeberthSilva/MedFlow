
package controller;

import model.*;
import service.login.Autenticador;
import java.util.Scanner;

public class MenuPrincipal {

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        Medico medicoSelecionado = null;
        Paciente pacienteSelecionado = null;

        Autenticador autenticador = new Autenticador("admin", "Admin123");
        Admin admin = new Admin("Admin", "Admin@gmail", "Admin123");

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
            System.out.println("6 - selecionar um paciente");
            System.out.println("7 - Adicionar prescrição");
            System.out.println("8 - listar prescrições do paciente selecionado");

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
                    if (medicoSelecionado == null) {
                        System.out.println("medico nao selecionado");
                    } else {
                        System.out.println("Listando pacientes do médico: Dr." + medicoSelecionado);
                        medicoSelecionado.listarPacientes();
                    }
                    break;

                case "6":
                    if (medicoSelecionado == null) {
                        System.out.println("Selecione um médico primeiro!");
                        break;
                    }

                    System.out.println("Lista de pacientes:");
                    medicoSelecionado.listarPacientes();

                    System.out.println("Escolha um paciente:");
                    int escolhaPaciente = sc.nextInt();
                    sc.nextLine();

                    pacienteSelecionado = medicoSelecionado.getPaciente(escolhaPaciente);

                    if (pacienteSelecionado == null) {
                        System.out.println("Paciente não encontrado.");
                    } else {
                        System.out.println("Paciente selecionado:");
                        System.out.println(pacienteSelecionado);
                    }
                    break;

                case "7":
                    if (pacienteSelecionado == null) {
                        System.out.println("Selecione um paciente primeiro!");
                        break;
                    }
                    System.out.println("Adicionar prescrição");
                    System.out.println("Nome do medicamento:");
                    String nomeMedicamento = sc.nextLine();
                    System.out.println("Descrição do medicamento:");
                    String descricaoMedicamento = sc.nextLine();
                    Medicamento medicamento = new Medicamento(
                            nomeMedicamento,
                            descricaoMedicamento
                    );

                    System.out.println("Dosagem:");
                    String dosagem = sc.nextLine();
                    System.out.println("Horário:");
                    String horario = sc.nextLine();
                    System.out.println("Frequência:");
                    String frequencia = sc.nextLine();
                    Prescricao prescricao = new Prescricao(
                            medicamento,
                            dosagem,
                            horario,
                            frequencia
                    );

                    pacienteSelecionado.adicionarPrescricao(prescricao);
                    System.out.println("Prescrição adicionada com sucesso!");
                    break;

                case "8":
                    if (pacienteSelecionado == null) {
                        System.out.println("Selecione um paciente primeiro!");
                    } else {
                        System.out.println("Prescrições do paciente:");
                        pacienteSelecionado.listarPrescricoes();
                    }
                    break;

                case "0":
                    System.out.println("Programa encerrado");
                    sc.close();
                    return;

                default:
                    System.out.println("opçao invalida");
            }
        }
    }
}


