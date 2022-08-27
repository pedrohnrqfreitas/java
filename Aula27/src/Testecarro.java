public class Testecarro {
    public static void main(String[] arg){

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do caro e: " + autonomia);

        double qntCombustivel10 = van.calcularCombutivel(10);
        double qntCombustivel15 = van.calcularCombutivel(15);

        System.out.println("Andar 10 km = " + qntCombustivel10);
        System.out.println("Andar 15 km = " + qntCombustivel15);
    }

}
