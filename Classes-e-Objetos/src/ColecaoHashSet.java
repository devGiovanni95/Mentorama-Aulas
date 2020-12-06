package src;
import java.util.Set;
import java.util.HashSet;
/*utilizando o HashSet*/
public class ColecaoHashSet {
    /*
    utilizamos inves de ArrayList utilizamos a listagem List para ficar mais facil para podermos trocar
    o tipo de lista que estaremos trabalhando
    dando assim uma facil manutenção

     */
    public static void main(String[] args) {
        Set<String> colecao = new HashSet<>();
//        colecao.add("Carro");
//        colecao.add("Moto");
//        colecao.add("Barco");
//        colecao.add("Carro");

        colecao.add("Carro");
        colecao.add("Moto");
        System.out.println(colecao.add("Barco"));
        /*
        deu true pois ele adicionou e nao tinha nenhum nome na lista
         igual a barco entao ele acrescentou na lista
                   */
        System.out.println(colecao.add("Carro"));
        /*
        Deu false pois ele tentou adicionar um nome de carro na lista
        mas ja tinha adicionado um nome igual la na primera adicao da lista
        entao sistema nao deixa ele criar outro categorioa com o nome igual
         */




        for (String veiculo : colecao) {
            System.out.println(veiculo);
        }
     }
}

