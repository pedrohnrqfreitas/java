public class exer05 {

    public static void main(String[] arg){

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "Banco do Brasil";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = 10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}
