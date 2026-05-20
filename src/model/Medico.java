package model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Usuario {

    private String crm;
    private String especialidade;
    private List<Paciente> pacientes;

    public Medico(String nome, String email, String senha, String crm, String especialidade) {
        super(nome, email, senha);
        this.crm = crm;
        this.especialidade = especialidade;
        this.pacientes = new ArrayList<>();
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void cadastrarPaciente(Paciente paciente) {
        if (!pacientes.contains(paciente)){
            pacientes.add(paciente);
        }
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente encontrado.");
        } else {
            int i = 1;
            for (Paciente p : pacientes) {
                System.out.println(i + " - " + p);
            }
        }
    }
    public Paciente getPaciente(int indice) {

        indice = indice - 1;

        if (indice >= 0 && indice < pacientes.size()) {
            return pacientes.get(indice);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                " | CRM: " + crm +
                " | Especialidade: " + especialidade;
    }
}
