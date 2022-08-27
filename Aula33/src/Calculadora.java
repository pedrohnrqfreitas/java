public class Calculadora {

    public int soma(int num1, int num2){
        return num1 + num2;
    }
    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int soma( int[] vetorInteriro){
        int total = 0;
        for (int i = 0; i < vetorInteriro.length ; i++) {
            total += vetorInteriro[i];
        }
        return  total;
    }
}
