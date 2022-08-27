public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;

    double valorEspecialUsado;

    boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo > quantiaASacar) {
            saldo -= quantiaASacar;
            return true;

        } else { //nao tem saldo na conta

            if (especial) { //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;

                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }

            } else {
                return false; //nao e especial e nao tem saldo\
            }
        }
    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }
    boolean verificarChequeEspecial(){
        return saldo < 0;
    }

}
