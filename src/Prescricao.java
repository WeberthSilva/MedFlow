public class Prescricao {

    // Atributos
    String paciente;
    String medicamento;
    String dosagem;

    // Construtor
    public Prescricao(String paciente, String medicamento, String dosagem) {
        this.paciente = paciente;
        this.medicamento = medicamento;
        this.dosagem = dosagem;
    }

    // Método para exibir a prescrição
    public void exibirPrescricao() {
        System.out.println("Paciente: " + paciente);
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Dosagem: " + dosagem);
    }

    // Método principal
    public static void main(String[] args) {

        // Criando objeto da classe Prescricao
        Prescricao p1 = new Prescricao(
                "João",
                "Paracetamol",
                "500mg a cada 8 horas"
        );

        // Exibindo dados
        p1.exibirPrescricao();
    }
}