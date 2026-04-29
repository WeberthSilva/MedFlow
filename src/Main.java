public class Main {
    public static void main(String[] args) {

        Medico medico = new Medico("roberto silva", "roberto@gmail", "82476692", "CRM/GO 123.456", "Pediatra");

        Paciente paciente = new Paciente("josé souza",92 , "diabetes tipo 2");
        Paciente paciente1 = new Paciente("maria da conceisão", 67, "asma");
        Paciente paciente2 = new Paciente("joão campos", 45, "cirugia de catarata");

        medico.cadastrarPaciente(paciente);
        medico.cadastrarPaciente(paciente1);
        medico.cadastrarPaciente(paciente2);
        medico.listarPacientes();



    }
}
