public class exer01 {
    public static void  main(String[] arg){

        lampada lampada = new lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garatiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoluz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeos";

    }
}
