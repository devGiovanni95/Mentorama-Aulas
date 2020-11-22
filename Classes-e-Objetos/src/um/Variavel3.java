package src.um;

public class Variavel3 {
    public static void main(String[] args) {
        int valor1 = 12;
        /*
        para fazer a conversão basta criar uma outra variavel e declarar o o nome da variavel anterior
        como faremos a seguir, salvo quando é um valor inteiro para um valor long
         */

        long valorLong = valor1;

        System.out.println(valorLong);
/*
quando tentamos converter um valor long para inteiro ja fica um pouco mais dificil
 */
      //  int valorInt = valorLong;

        int valorInt = (int)valorLong;
        System.out.println(valorInt);

        double valorDouble = valorInt;
        System.out.println(valorDouble);

        long outroLong = (long)valorDouble;
        System.out.println(outroLong);



    }
}
