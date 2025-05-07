public class Viagem {
    String viajante;
    String destino;
    double diariaPorPessoa;
    double alimentacaoPorPessoa;
    double transportePorPessoa;
    int nPessoas;
    int duracaoEmDias;

    double calcCusto(){
        double total = (this.diariaPorPessoa + this.alimentacaoPorPessoa + this.transportePorPessoa) * this.nPessoas;
        return total;
    }
    public Viagem(String viajante, String destino, double diariaPorPessoa, double alimentacaoPorPessoa, double transportePorPessoa, int nPessoas,int duracaoEmDias){
        this.viajante = viajante;
        this.destino = destino;
        this.diariaPorPessoa = diariaPorPessoa;
        this.alimentacaoPorPessoa = alimentacaoPorPessoa;
        this.transportePorPessoa = transportePorPessoa;
        this.nPessoas = nPessoas;
        this.duracaoEmDias = duracaoEmDias;
    }
    public Viagem(String destino, int duracaoEmDiaS){
        this.destino = destino;
        this.duracaoEmDias = duracaoEmDias;
    }

    void exibir(String viajante){
        System.out.println("Viajante: " + viajante);
        System.out.println("Destino: " + destino);
        System.out.println("diaria: " + diariaPorPessoa);
        System.out.print("Alimentação: " + alimentacaoPorPessoa);
        System.out.println("Transporte: " + transportePorPessoa);
        System.out.println("Número de pessoas: " + nPessoas);
        System.out.println("Duração(em dias): " + duracaoEmDias);
    }

    void exibir(){
        System.out.println("Destino: " + destino);
        System.out.println("diaria: " + diariaPorPessoa);
        System.out.print("Alimentação: " + alimentacaoPorPessoa);
        System.out.println("Transporte: " + transportePorPessoa);
        System.out.println("Número de pessoas: " + nPessoas);
        System.out.println("Duração(em dias): " + duracaoEmDias);
    }

}
