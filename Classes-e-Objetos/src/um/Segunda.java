package src.um;

public class Segunda {

    private void metodoPrivado() {
        Primeiro primeiro = new Primeiro();
        primeiro.metodoPublico();
        primeiro.metodoPrivado();
        primeiro.metodoProtected();
        primeiro.metodoDefault();

        primeiro.metodoEstatico(); //nao conseguimos acessar deste modo
        Primeiro.metodoEstatico(); //conseguimos acessar o metodo Estatico utilizando a Classe que ela pertence

    }
}