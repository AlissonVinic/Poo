import java.time.LocalTime;

import desafio.Vaga;
import desafio.Veiculo;
import q05.Pedido;
import q05.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(5, 6, 7);
        triangulo.mostrarTriangulo();
        System.out.println("========================");
        triangulo.setAltura(80);
        System.out.println(triangulo.getAltura());
        System.out.println("========================");
        triangulo.mostrarTriangulo();

    }
}
