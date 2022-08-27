public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoluz;
    private int garatiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoluz() {
        return tipoluz;
    }

    public void setTipoluz(String tipoluz) {
        this.tipoluz = tipoluz;
    }

    public int getGaratiaMeses() {
        return garatiaMeses;
    }

    public void setGaratiaMeses(int garatiaMeses) {
        this.garatiaMeses = garatiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public void mostrarEstado(){
        if (isLigada()){
            System.out.println("Lampada esta Ligada");
        }else{
            System.out.println("Lampada esta Desligada ");
        }
    }

    public void mudarEstado(){
        if(isLigada()){
            desligar();
        }else {
            ligar();
        }
    }
}

