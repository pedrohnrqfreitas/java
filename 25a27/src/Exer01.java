public class Exer01 {
    public static void  main(String[] args){

         lampada lampada = new lampada();

         lampada.ligar();
         lampada.mostrarEstado();

         lampada.desligar();
         lampada.mostrarEstado();

         lampada.mudarEstado();
         lampada.mostrarEstado();
    }
}
