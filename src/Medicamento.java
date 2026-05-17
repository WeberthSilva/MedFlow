public class Medicamento {

    // Atributos
    String nome;
    String descricao;

    // Método construtor
    public Medicamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
    }

    // Método principal
    public static void main(String[] args) {

        // Criando objeto da classe Medicamento
        Medicamento medicamento1 = new Medicamento(
                "Paracetamol",
                "Utilizado para aliviar dores e febre."
        );

        // Exibindo informações
        medicamento1.exibirInformacoes();
    }
}