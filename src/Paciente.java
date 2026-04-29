public class Paciente {

    private String nome;
    private int idade;
    private String historico;

    public Paciente(String nome, int idade, String historico) {
        this.nome = nome;
        this.idade = idade;
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "| Idade: " + idade + "| Historico:" + historico;
    }


}

