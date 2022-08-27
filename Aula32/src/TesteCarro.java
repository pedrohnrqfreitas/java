public class TesteCarro {
    public static void main(String[] args){

        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("Monza");

        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
    }
}
