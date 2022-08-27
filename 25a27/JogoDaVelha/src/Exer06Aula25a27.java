import java.util.Arrays;
import java.util.Scanner;

public class Exer06Aula25a27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogaVelha = new char[3][3];
        char jogador1 = 'X';
        char jogador2 = 'O';

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        iniciarTabela(jogaVelha);
        mostraTabela(jogaVelha);

        while(!ganhou){

            if(jogada % 2 == 1){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'X';

            }else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }

            //Validar se linha e coluna esta correto

            boolean verificado = false;

            do {
                do {
                    System.out.println("Digite a linha:");
                    linha = scan.nextInt();
                    if(linha < 1 || linha > 3) {
                        System.out.println("Entrada invalida, tente novamente");
                    }
                } while (linha < 1 || linha > 3);

                do {
                    System.out.println("Digite a coluna:");
                    coluna = scan.nextInt();
                    if(coluna < 1 || coluna > 3) {
                        System.out.println("Entra invalida, tente novamente");
                    }
                } while (coluna < 1 || coluna > 3);

                verificado = verficarLocal(jogaVelha, linha, coluna);
            }
            while(verificado);

            colocar(jogaVelha, linha,  coluna, sinal);

            mostraTabela(jogaVelha);

            jogada++;

            if ((jogaVelha[0][0] == 'X' && jogaVelha[0][1] == 'X' && jogaVelha[0][2] == 'X') || //linha 1
                    (jogaVelha[1][0] == 'X' && jogaVelha[1][1] == 'X' && jogaVelha[1][2] == 'X')|| //linha 2
                    (jogaVelha[2][0] == 'X' && jogaVelha[2][1] == 'X' && jogaVelha[2][2] == 'X')|| //linha 3
                    (jogaVelha[0][0] == 'X' && jogaVelha[1][0] == 'X' && jogaVelha[2][0] == 'X')|| //coluna 1
                    (jogaVelha[0][1] == 'X' && jogaVelha[1][1] == 'X' && jogaVelha[2][1] == 'X')|| //coluna 2
                    (jogaVelha[0][2] == 'X' && jogaVelha[1][2] == 'X' && jogaVelha[2][2] == 'X')||
                    (jogaVelha[0][0] == 'X' && jogaVelha[1][1] == 'X' && jogaVelha[2][2] == 'X')||
                    (jogaVelha[2][2] == 'X' && jogaVelha[1][1] == 'X' && jogaVelha[0][0] == 'X')){ //coluna 3
                ganhou = true;
                System.out.println("Jogador 1, Ganhou");
            }
            else if ((jogaVelha[0][0] == 'O' && jogaVelha[0][1] == 'O' && jogaVelha[0][2] == 'O') || //linha 1
                    (jogaVelha[1][0] == 'O' && jogaVelha[1][1] == 'O' && jogaVelha[1][2] == 'O')|| //linha 2
                    (jogaVelha[2][0] == 'O' && jogaVelha[2][1] == 'O' && jogaVelha[2][2] == 'O')|| //linha 3
                    (jogaVelha[0][0] == 'O' && jogaVelha[1][0] == 'O' && jogaVelha[2][0] == 'O')|| //coluna 1
                    (jogaVelha[0][1] == 'O' && jogaVelha[1][1] == 'O' && jogaVelha[2][1] == 'O')|| //coluna 2
                    (jogaVelha[0][2] == 'O' && jogaVelha[1][2] == 'O' && jogaVelha[2][2] == 'O')||//coluna 3
                    (jogaVelha[0][0] == 'O' && jogaVelha[1][1] == 'O' && jogaVelha[2][2] == 'O')||
                    (jogaVelha[2][2] == 'O' && jogaVelha[1][1] == 'O' && jogaVelha[0][0] == 'O'))
            {
                ganhou = true;
            }
            else if(jogada > 9){
                ganhou = true;
            }

            }

        }

    public static void colocar(char[][] jogaVelha, int linha, int coluna, char jogadaJogador){
        jogaVelha[linha - 1][coluna - 1] = jogadaJogador;
    }

    public static boolean verficarLocal(char[][] jogaVelha, int linha, int coluna){
        if (jogaVelha[linha - 1][coluna - 1] == 'X' || jogaVelha[linha - 1][coluna - 1] == 'O') {
            System.out.println("Posicao ja usada, tente novamente");
            return true;
        }
        return false;
    }

    public static void mostraTabela(char[][] jogaVelha){

        int linha;
        int coluna;

        for (linha = 0; linha < 3; linha++){
            for (coluna = 0; coluna < 3; coluna++){
                System.out.print(jogaVelha[linha][coluna]);
                if (coluna < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    public static void iniciarTabela(char[][] jogaVelha){

        int linha;
        int coluna;

        for (linha = 0; linha < 3; linha++){
            for (coluna = 0; coluna < 3; coluna++){
                jogaVelha[linha][coluna] = ' ';
            }
        }
    }
}