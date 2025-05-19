import java.time.LocalTime;;
public class Consulta {
    String paciente;
    String especialidade;
    LocalTime horario = LocalTime.now();

    void exibirConsulta(){
        System.out.println("Paciente: " + paciente);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Horário: " + horario);
    }
    void exibirConsulta(boolean mostrarConfirmacao){
        System.out.println("Paciente: " + paciente);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Horário: " + horario);
        if(mostrarConfirmacao){
            System.out.println("Consulta confirmada.");
        }//Enunciado não diz o que acontece se o parâmetro for false
    }

    public Consulta(String paciente, LocalTime horario){
        this.paciente = paciente;
        this.especialidade = "Clínico geral";
        this.horario = horario;
    }
    public Consulta(String paciente, String especialidade, LocalTime horario){
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.horario = horario;
    }
}
