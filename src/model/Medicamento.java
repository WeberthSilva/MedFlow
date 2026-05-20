package model;

public class Medicamento {
    private String nome;
    private String descricao;

    public Medicamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "| Descrição: " + getDescricao();
    }
}


