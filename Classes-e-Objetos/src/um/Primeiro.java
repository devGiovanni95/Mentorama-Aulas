package src.um;

public class Primeiro {

    private Integer variavel = 1;

    private static Integer variavel1 = 1;
//final = nao pode ser
//statica = que podemos acessar de qualquer lugar sem precisar estanciar
//Integer = tipo
//Constantes criamos com letra maiuscula. para diferenciar das demais.Pois elas nao sao alteraveis

    public final static Integer CONSTANTE = 10;

    private Integer escopoClasse = 1;

    public static Integer metodoEstatico() {
        // metodoPublico(); quando estamos dentro de um metodo estatico nao conseguimos
        // acessar um metodo
        // publico dentro do mesmo. O mesmo acontece com variaveis. A menos que elas
        // sejem estaticas tambem
        // variavel nao conseguimos acessar por nao ser uma variavel statica

        // return 1; nao acessamos a variavel publica;privada

        return variavel1; // conseguimos acessar por ser uma variavel estatica
    }

    public void metodoPublico() {

//        CONSTANTE = 20;   o proprio sistema nao deixa mudarmos o valor da constante pois tem um valor finar dja definido nao deixqand0o assim alterarmos
//        Integer variavel = 1;
//
//        System.out.println(variavel);
//        variavel = 2;
//        System.out.println(variavel);

        System.out.println(escopoClasse);
        escopoClasse = 2;

        System.out.println(escopoClasse);
    }

    public void alteraVariavel() {
        System.out.println(escopoClasse);
        escopoClasse = escopoClasse + 2;
        System.out.println(escopoClasse);

    }

    public void metodoPrivado() {
        // colocamos como public void para podermos acessar da outra pasta
    }

    protected void metodoProtected() {

    }

    void metodoDefault() {

    }
}