package src.um;

import src.Cores;

public class Variavel6 {
    public static void main(String[] args) {
        System.out.println(Cores.AZUL);
        /*
         deste jeito puxariamos a costante do jeito que ela esta declarada no ENUM para puxar ela em formato de textos faremos assim:
        */
        System.out.println(Cores.AZUL.getTexto());
    }
}
