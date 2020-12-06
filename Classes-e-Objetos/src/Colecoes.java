package src;

import java.util.ArrayList;

public class Colecoes {

    public static void main(String[] args) {
        ArrayList<String> colecao = new ArrayList<>();
        colecao.add("Carro");
        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");

        System.out.println(colecao.get(0));
        System.out.println(colecao.get(2));

        /*
        para objeto veiculo recebe (o que estiver dentro da :)colecao - imprima veiculo
        percorre por toda a categoria de array
         */
        for (String veiculo: colecao) {
            System.out.println(veiculo);
        }

        /*
        remove oa colecao o item 0;
        mas remove do 2 FOR pois foi declarado depois do 1
         */
        colecao.remove(0);

        /*
        para numero inteiro i recebe a posição 0; enquanto i for menor que o tamanho da colecao;
        inclementando com i++
        imprime pegando do array colecao os valores de i
         */
        for(int i= 0; i < colecao.size(); i++) {
            System.out.println(colecao.get(i));
        }

    }
}
