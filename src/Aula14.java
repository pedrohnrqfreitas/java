import java.util.Scanner;
public class Aula14 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Sua idade: ");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Nao e maior de idade");
        }
    }
}
