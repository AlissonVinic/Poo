package q05;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    double valorTotal;

    public void exibirProduto(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
    public void exibirProduto(String nome){
        this.nome = nome;
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor total: R$" + valorTotal);
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorTotal = preco*quantidade;
    }

}
