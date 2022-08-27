public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe carro foi instanciada");
        numPassageiros = 4 ;
    }

    Carro(String marca, String modelo, int numPassageiros, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = consumoCombustivel;

    }


    void exibirAutonomia(){
        System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia(){
        System.out.println("Metodo obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombutivel(double km){
        double qntCombustivel = km/consumoCombustivel;
        return qntCombustivel;
    }

}
