package model;

public class Prescricao {


    private Medicamento medicamento;
    private String dosagem;
    private String horario;
    private String frequencia;


    public Prescricao( Medicamento medicamento, String dosagem, String horario,String frequencia) {
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.horario =  horario;
        this.frequencia = frequencia;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public String getDosagem() {
        return dosagem;
    }

    public String getHorario() {
        return horario;
    }

    public String getFrequencia() {
        return frequencia;
    }

    @Override
    public String toString() {
        return " | Medicamento: " + medicamento +
                " | Dosagem: " + dosagem +
                " | horário: " + horario +
                " | frequência: " + frequencia  ;


    }

}