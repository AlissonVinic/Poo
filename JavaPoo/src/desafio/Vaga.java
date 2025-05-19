package desafio;

public class Vaga {
    int numDaVaga;
    boolean ocupada;
    Veiculo veiculo;

    public void ocuparVaga(Veiculo veiculo){
        if(this.ocupada){
            System.out.println("A vaga já está ocupada.");
        }else{
            System.out.println("Vaga ocupada com sucesso.");
            this.ocupada = true;
            this.veiculo = veiculo;
        }
    }
    public void liberarVaga(){
        if(this.ocupada){
            this.ocupada = false;
        }else{
            System.out.println("A vaga já está desocupada.");
        }
    }
    public void exibirStatus(){
        System.out.println("Número da vaga: " + this.numDaVaga);
        if(this.ocupada){
            System.out.println("Veículo na vaga: " + this.veiculo.tipo);
        }else{
            System.out.println("Vaga livre.");
        }
    }
    public void exibirStatus(boolean mostrarDetalhes){
        System.out.println("Número da vaga: " + this.numDaVaga);
        if(this.ocupada){
            System.out.println("Veículo na vaga: " + this.veiculo.tipo);
            System.out.println("Placa do veículo: " + this.veiculo.placa);
        }else{
            System.out.println("Vaga livre.");
        }
    }

    public Vaga(int numDaVaga, boolean ocupada){
        this.numDaVaga = numDaVaga;
        this.ocupada = ocupada;
    }
    public Vaga(int numDaVaga){
        this.ocupada = false;
    }
}
