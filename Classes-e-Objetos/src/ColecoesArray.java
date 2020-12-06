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
    }
}
