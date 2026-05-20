package model;

import java.util.List;
import java.util.ArrayList;

public class Paciente {

    private String nome;
    private int idade;
    private String historico;
    private List<Medicamento> medicamentos;
    private List<Prescricao> prescricaos;

    public Paciente(String nome, int idade, String historico) {
        this.nome = nome;
        this.idade = idade;
        this.historico = historico;
        this.medicamentos = new ArrayList<>();
        this.prescricaos = new ArrayList<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        if (!medicamentos.contains(medicamento)) {
            medicamentos.add(medicamento);
        }
    }

    public void listarMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento encontrado.");
        } else {
            int i = 1;
            for (Medicamento m : medicamentos) {
                System.out.println(i + " - " + m);
                i++;
            }
        }
    }
    public void adicionarPrescricao(Prescricao prescricao){
        if (!prescricaos.contains(prescricao)) {
            prescricaos.add(prescricao);
        }
    }
    public void listarPrescricoes() {
        if (prescricaos.isEmpty()) {
            System.out.println("Nenhuma prescição encontrado.");
        } else {
            int i = 1;
            for (Prescricao P : prescricaos) {
                System.out.println(i + " - " + P);
                i++;
            }
        }
    }




    @Override
    public String toString() {
        return "Nome: " + nome +
                "| Idade: " + idade +
                "| Historico:" + historico;
    }

}

