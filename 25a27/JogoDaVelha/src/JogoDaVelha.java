import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        JogaDaVelhaClasse jogodavelha = new JogaDaVelhaClasse();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;

        while(!ganhou){
            if(jogodavelha.vezJogador1()){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'X';

            }else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }

            linha = valor("linha", scan);
            coluna = valor("coluno", scan);

            jogodavelha.verficarLocal(jogodavelha.jogaVelha, linha, coluna);

            jogodavelha.colocar(jogodavelha.jogaVelha, linha,  coluna, sinal);;

            jogodavelha.mostraTabela();

            jogodavelha.jogada++;

            if (jogodavelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Jogador 1 ganhou");
            }else if(jogodavelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Jogador 2 ganhou");
            }else if(jogodavelha.jogada > 9){
                ganhou = true;
                System.out.println("Deu velha");
            }
        }
    }
    static int valor(String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido){
            System.out.println("Entre com a " + tipoValor + " (1, 2, 3)");
            valor = scan.nextInt();
            if(valor >= 1 && valor <=3){
                valorValido = true;
            }else{
                System.out.println("Entrada invalaida, tente novamente");
            }
        }
        valor--;
        return valor;
    }

}
