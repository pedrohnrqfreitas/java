public class Exer02 {

    public static void main(String[] arg){

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "Banco do Brasil";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("Nao foi possivel realizar saque. Saldo insufisiente");
        }

        saqueEfetuado = conta.realizarSaque(500);

        System.out.println("Tentaiva de saque de 500 reais");
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("Nao foi possivel realizar saque. Saldo insufisiente");
        }


        System.out.println("Despositado de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        }else{
            System.out.println("Nao esta usando cheque especial");
        }

        saqueEfetuado = conta.realizarSaque(600);
        conta.consultarSaldo();

        if (conta.verificarChequeEspecial()){
            System.out.println("Esta usando cheque especial");
        }else{
            System.out.println("Nao esta usando cheque especial");
        }
    }
}
