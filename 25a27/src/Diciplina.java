public class Diciplina {

    String nome;
    float[] notas = new float[3];

    float fazerMedia(){
        float media = 0;
        for (int i = 0; i < 3 ; i++) {
            media += notas[i];
        }
        return media / 3;
    }
}
