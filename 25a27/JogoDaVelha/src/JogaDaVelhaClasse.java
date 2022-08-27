public class JogaDaVelhaClasse {

    char[][] jogaVelha;

    int linha;

    int coluna;

    char ganhou;

    int jogada = 1;

    boolean vezJogador1(){
        if(jogada % 2 == 1){
            return true;
        }
        return false;
    }

    public JogaDaVelhaClasse(){
        jogaVelha = new char[3][3];
        int jogada;
    }

    boolean verficarLocal(char[][] jogaVelha, int linha, int coluna){
        if (jogaVelha[linha][coluna] == 'X' || jogaVelha[linha][coluna] == 'O') {
            System.out.println("Posicao ja usada, tente novamente");
            return true;
        }
        return false;
    }

    void colocar(char[][] jogaVelha, int linha, int coluna, char jogadaJogador){
        jogaVelha[linha][coluna] = jogadaJogador;
    }

    void mostraTabela() {

        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.print(jogaVelha[linha][coluna]);
                if (coluna < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char sinal) {
        if ((jogaVelha[0][0] == sinal && jogaVelha[0][1] == sinal && jogaVelha[0][2] == sinal) || //linha 1
                (jogaVelha[1][0] == sinal && jogaVelha[1][1] == sinal && jogaVelha[1][2] == sinal) || //linha 2
                (jogaVelha[2][0] == sinal && jogaVelha[2][1] == sinal && jogaVelha[2][2] == sinal) || //linha 3
                (jogaVelha[0][0] == sinal && jogaVelha[1][0] == sinal && jogaVelha[2][0] == sinal) || //coluna 1
                (jogaVelha[0][1] == sinal && jogaVelha[1][1] == sinal && jogaVelha[2][1] == sinal) || //coluna 2
                (jogaVelha[0][2] == sinal && jogaVelha[1][2] == sinal && jogaVelha[2][2] == sinal) ||
                (jogaVelha[0][0] == sinal && jogaVelha[1][1] == sinal && jogaVelha[2][2] == sinal) ||
                (jogaVelha[2][2] == sinal && jogaVelha[1][1] == sinal && jogaVelha[0][0] == sinal)) { //coluna 3
            System.out.println("O " + sinal + " , ganhou");
            return true;
        }
        return false;
    }


}
