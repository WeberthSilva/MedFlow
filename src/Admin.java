import java.util.ArrayList;
import java.util.List;

public class Admin extends Usuario {

    private List<Medico> medicos;

    public Admin(String nome, String email, String senha) {
        super(nome, email, senha);
        this.medicos = new ArrayList<>();
    }

    public void cadastrarMedico(Medico medico){
        medicos.add(medico);
    }
    public void listarMedicos(){
        for(Medico m : medicos){
            System.out.println(m);
        }
}}