import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digita o nome:");
        aluno.nome = sc1.nextLine();

        System.out.println("Digita a matricula:");
        aluno.matricula = sc1.next();

        System.out.println("Digita o curso:");
        aluno.curso = sc1.next();

        for (int i = 0; i < 3; i++) {

            Diciplina diciplina = new Diciplina();

            System.out.println("Digita a diciplina " + (i + 1) + " :");
            diciplina.nome = sc1.next();

            for (int j = 0; j < 3; j++) {
                System.out.println("Digita a nota " + (j + 1) + " :");
                diciplina.notas[j] = sc1.nextFloat();
            }

            aluno.diciplinas[i] = diciplina;
        }

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diciplina: " + aluno.diciplinas[i].nome);
            for (int j = 0; j < 3 ; j++) {
                System.out.println("Notas: " + aluno.diciplinas[i].notas[j]);
            }
        }

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diciplina " + aluno.diciplinas[i].nome + " - " + aluno.verificarNota(i));
        }

    }
}
