package q05;

public class Pedido {
    String cliente;
    String endereco;
    String email;
    Produto prod;

    public void exibirPedido(){
        System.out.println(this.cliente);
        System.out.println(this.endereco);
        System.out.println(this.email);
        System.out.println(this.prod.nome);
        System.out.println("R$"+this.prod.preco);
        System.out.println("Valor total: R$" + this.prod.valorTotal);
    }
    public void exibirPedido(String cliente){
        System.out.println(cliente);
        System.out.println(this.endereco);
        System.out.println(this.email);
        System.out.println(this.prod.nome);
        System.out.println("R$" + this.prod.preco);
        System.out.println("Valor total: R$" + this.prod.valorTotal);
    }

    public Pedido(String cliente, Produto produto){
        this.cliente = cliente;
        this.prod = produto;
    }
    public Pedido(String cliente, String endereco, String email, Produto produto){
        this.cliente = cliente;
        this.endereco = endereco;
        this.email = email;
        this.prod = produto;
    }

}
