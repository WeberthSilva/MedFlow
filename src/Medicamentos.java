import java.util.ArrayList;

public class Medicamentos {

    // Atributos
    String nome;
    String descricao;

    // Lista de medicamentos
    static ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();

    // Construtor
    public Medicamentos(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Método para cadastrar medicamento
    public static void cadastrarMedicamento(String nome, String descricao) {
        Medicamento medicamento = new Medicamento(nome, descricao);
        listaMedicamentos.add(medicamento);
        System.out.println("Medicamento cadastrado com sucesso!");
    }

    // Método para listar medicamentos
    public static void listarMedicamentos() {
        System.out.println("\n--- LISTA DE MEDICAMENTOS ---");

        for (Medicamento med : listaMedicamentos) {
            System.out.println("Nome: " + med.nome);
            System.out.println("Descrição: " + med.descricao);
            System.out.println("----------------------------");
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Cadastrando medicamentos
        cadastrarMedicamento(
                "Paracetamol",
                "Utilizado para dores e febre."
        );

        cadastrarMedicamento(
                "Ibuprofeno",
                "Anti-inflamatório e analgésico."
        );

        // Listando medicamentos
        listarMedicamentos();
    }
}