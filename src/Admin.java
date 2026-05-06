import java.util.ArrayList;
import java.util.List;

public class Admin extends Usuario {

    private List<Medico> medicos;

    public Admin(String nome, String email, String senha) {
        super(nome, email, senha);
        this.medicos = new ArrayList<>();
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void listarMedicos() {
        int i = 1;
        for (Medico m : medicos) {
            System.out.println(i+"-"+ m);
            i++;
        }
    }

    public Medico getMedico(int indice) {
        indice = indice - 1;
        if (indice >= 0 && indice < medicos.size()) {
            return medicos.get(indice);
        }else {
            return null;
        }
    }



}