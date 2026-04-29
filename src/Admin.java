public class Admin extends Usuario{

    public Admin(String nome, String email, String senha){
        super(nome, email, senha);
    }
    public void cadastrarMedico(){
        System.out.println("Médico cadastrado");
    }

}