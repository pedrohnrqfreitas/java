class lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoluz;
    int garatiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada esta Ligada");
        }else{
            System.out.println("Lampada esta Desligada ");
        }
    }
    void mudarEstado(){
        if(ligada){
            desligar();
        }else {
            ligar();
        }
    }
}
