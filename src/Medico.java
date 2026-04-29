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
    public void cadastrarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    public void listarPacientes(){
        for(Paciente p : pacientes){
            System.out.println(p);
        }
    }
}
