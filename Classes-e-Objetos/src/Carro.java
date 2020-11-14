package src;

public class Carro {
    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";

    private Integer quantidadePneus;

/*    public Carro() {}   = construtor que o java automaticamente cria */
/*o construtor acima e a versao basica que o java ja cria. agora se quizermos que ele mostre
 algumas informações como a quantidade de pneus do carro faremos assim: */
    public Carro(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
        /* o this.quantidadePneus pega  dav vaiavel la fora e po segungo quantidadePneus pega do construtor declarado na classe*/
    }
    public void setCor(String cor){
        System.out.println(cor);
    }
    public void imprimeValores() {
        System.out.println("Quantidade de pneus " + quantidadePneus);
    }
}
//Exemplo de constantes que nao serao alteradas por ser de um carro de cor fixo