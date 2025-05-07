public class App {
    public static void main(String[] args) throws Exception {
        Viagem v1 = new Viagem("Torre Eifel, França.", 4);
        Viagem v2 = new Viagem("Alisson", "Paris", 200, 300, 150, 3, 4);
        v1.exibir("Alisson");
        System.out.println("----------------------------");
        v2.exibir();
        System.out.println("----------------------------");
        System.out.printf("Custo total: %.2f\n", v2.calcCusto());

    }
}
