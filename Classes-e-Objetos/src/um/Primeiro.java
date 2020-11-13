package src.um;

public class Primeiro {

    private Integer variavel = 1;
    private static Integer variavel1 = 1;

    public static Integer metodoEstatico() {
      // metodoPublico();   quando estamos dentro de um metodo estatico nao conseguimos acessar um metodo
     //   publico dentro do mesmo. O mesmo acontece com variaveis. A menos que elas sejem estaticas tambem
    //variavel nao conseguimos acessar por nao ser uma variavel statica

       // return 1;     nao acessamos a variavel publica;privada

        return variavel1;  //conseguimos acessar por ser uma variavel estatica
    }

    public void metodoPublico() {

    }

    public void metodoPrivado() {
        // colocamos como public void para podermos acessar da outra pasta
    }

    protected void metodoProtected() {

    }

    void metodoDefault() {

    }
}