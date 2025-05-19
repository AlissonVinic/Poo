public class Filme {
    String nome;
    String descricao;
    int ano;
    double nota;

    public Filme(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public Filme(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Ano: " + ano);
        if(nota >=0 && nota <= 5){
            System.out.println("Nota: " + nota);
        }
        else{
            System.out.println("A nota deve ser de 1 a 5.");
        }
    }
}
