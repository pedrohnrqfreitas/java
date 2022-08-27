public class Testecarro {
    public static void main(String[] arg){

        Carro van = new Carro();
        van.marca = "fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();
    }

}
