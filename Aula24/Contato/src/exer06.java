public class exer06 {
    public static void main (String[] arg){

        contato contato1 = new contato();
        contato1.nome = "Joao";
        contato1.email = "joao@gmail.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999999";
        contato1.telefones[1] = "98889889";
        contato1.telefones[2] = "31230912";

        System.out.println("Nome: " + contato1.nome + " \nNumero " + contato1.telefones[0]);

    }
}
