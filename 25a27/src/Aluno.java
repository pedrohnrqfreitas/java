public class Aluno {

    String nome;
    String matricula;
    String curso;
    Diciplina[] diciplinas = new Diciplina[3];

    /*String verificarNota(int posicao){
        for(int i = 0 ; i <= 2; i++){
            if(nota[posicao] >= 7){
                return "Aprovado";
            }
        }
        return "Reprovado";
    }*/
    String verificarNota(int posicao){
        if(diciplinas[posicao].fazerMedia() >= 7){
            return "Aprovado";
        }
        return "Reprovado";
    }
}
//Scanner sc1 = new Scanner(System.in);
