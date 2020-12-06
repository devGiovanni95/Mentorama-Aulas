package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*utilizando o LinkedList*/
public class Colecoes2 {
/*
utilizamos inves de ArrayList utilizamos a listagem List para ficar mais facil para podermos trocar
o tipo de lista que estaremos trabalhando
dando assim uma facil manutenção

 */
    public static void main(String[] args) {
        List<String> colecao = new LinkedList<>();
        colecao.add("Carro");
        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");

        System.out.println(colecao.get(0));
        System.out.println(colecao.get(2));

        for (String veiculo: colecao) {
            System.out.println(veiculo);
        }

        colecao.remove(0);

        for(int i= 0; i < colecao.size(); i++) {
            System.out.println(colecao.get(i));
        }

    }
}
