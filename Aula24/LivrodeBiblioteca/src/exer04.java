import java.util.Date;

public class exer04 {
    public static void main(String[] arg){
        livrodebiblioteca livro = new livrodebiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane";
        livro.anoLancamento = 2015;
        livro.emprestado = true;
        livro.dateEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro "  + livro.nome);
        System.out.println("Emprestado para "  + livro.emprestadoA);

    }
}
