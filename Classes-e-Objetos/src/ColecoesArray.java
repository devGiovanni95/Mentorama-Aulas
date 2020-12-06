package src;

public class ColecoesArray {
    public static void main(String[] args) {
        /*colchetes significa que é um array*/
        int[] valores = new int[4]; // 4 posicoes
        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        int[] valoresReversos = new int[valores.length];
        int posicaoMaxima = valores.length - 1;
        for (int i = posicaoMaxima; i >= 0 ; i --) {
//            System.out.println(valores[i]);
            valoresReversos[posicaoMaxima - i] = valores[i];
        }

        for (int i = 0; i < valoresReversos.length; i++) {
            System.out.println(valoresReversos[i]);
        }

    }
}
