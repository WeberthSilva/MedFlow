package service.login;
public class Autenticador {

    private String loginCorreto;
    private String senhaCorreta;

    public Autenticador(String loginCorreto, String senhaCorreta) {
        this.loginCorreto = loginCorreto;
        this.senhaCorreta = senhaCorreta;
    }

    public boolean autenticar(String loginDigitado, String senhaDigitada) {
        return this.loginCorreto.equals(loginDigitado) && this.senhaCorreta.equals(senhaDigitada);
    }
}




