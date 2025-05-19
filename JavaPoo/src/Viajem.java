public class Viajem {
    String viajante;
    String destino;
    int duracaoEmDias;
    double valorDaDiaria;

    void exibir(){
        System.out.println("Viajante: " + this.viajante);
        System.out.println("Destino: " + this.destino);
        System.out.println("Duração(dias):" + this.duracaoEmDias);
        System.out.println("Valor da diária: " + this.valorDaDiaria);
    }
    void exibir(String viajante){
        this.viajante = viajante;
        System.out.println("Viajante: " + this.viajante);
        System.out.println("Destino: " + this.destino);
        System.out.println("Duração(dias):" + this.duracaoEmDias);
        System.out.println("Valor da diária: " + this.valorDaDiaria);

    }

    double custoTotal(){
        double custo = duracaoEmDias*valorDaDiaria;
        return custo;
    }

    public Viajem(String viajante,String destino, int duracaoEmDias, double valorDaDiaria){
        this.viajante = viajante;
        this.destino = destino;
        this.duracaoEmDias = duracaoEmDias;
        this.valorDaDiaria = valorDaDiaria;
    }

    public Viajem(String destino, int duracaoEmDias, double valorDaDiaria){
        this.destino = destino;
        this.duracaoEmDias = duracaoEmDias;
        this.valorDaDiaria = valorDaDiaria;
    }
}
