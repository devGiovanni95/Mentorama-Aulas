package src;

import src.um.Primeiro;

public class ClasseMain {

    public static void main(String... args) {
/*        Primeiro primeiro = new Primeiro();
        Primeiro outraClasse = new Primeiro();
//        primeiro.metodoPublico();
//        primeiro.metodoPublico();

        primeiro.metodoPublico();
//        primeiro.alteraVariavel();
        outraClasse.alteraVariavel();

        primeiro.metodoPublico();*/

        Carro carro = new Carro(4);  //depois que criamos um construtor na classe publica do carro somos obrigados a declarar no caso a quantidade de pneus que o carro tem
        carro.setCor(Carro.VERMELHO);

        carro.imprimeValores();
    }
}
