
import java.time.LocalTime;
public class Reserva {
    String cliente;
    int numDePessoas;
    int numDaMesa;
    LocalTime horario;

    void exibirReserva(){
        System.out.println("Cliente: " + cliente);
        System.out.println("número de pessoas: " + numDePessoas);
        System.out.println("Número da mesa: " + numDaMesa);
        System.out.println("Horário: " + horario);
    }

    void exibirReserva(String PedidoEspecial){
        System.out.println("Cliente: " + cliente);
        System.out.println("número de pessoas: " + numDePessoas);
        System.out.println("Número da mesa: " + numDaMesa);
        System.out.println("Horário: " + horario);
        System.out.println("Pedido especial: " + PedidoEspecial);
    }

    public Reserva(String cliente, int numDePessoas, int numDaMesa, LocalTime horario){
        this.cliente = cliente;
        this.numDePessoas = numDePessoas;
        this.numDaMesa = numDaMesa;
        this.horario = horario;
    }
    public Reserva(String cliente, LocalTime horario){
        this.cliente = cliente;
        this.horario = horario;
    }

}
