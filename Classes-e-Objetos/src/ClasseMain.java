package src;

import src.um.Primeiro;

public class ClasseMain {

    public static void main(String... args) {
        Primeiro primeiro = new Primeiro();
        Primeiro outraClasse = new Primeiro();
//        primeiro.metodoPublico();
//        primeiro.metodoPublico();

        primeiro.metodoPublico();
//        primeiro.alteraVariavel();
        outraClasse.alteraVariavel();

        primeiro.metodoPublico();
    }
}
