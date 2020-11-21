package src.um;

public class Variavel {
    public static void main(String[] args) {
   /*     //  int valor1 = 12; //declarando de um tipo primitivo
      //  Integer valor1 = Integer.valueOf(12);
        Integer valor1 = 12;   //objeto outboxing  (objeto apparence)

        int valor2 = valor1;    //objeto onboxing

        System.out.println(valor1);
        System.out.println(valor2);
        valor2 = 20;
        System.out.println(valor1);
        System.out.println(valor2);
*/
/*
NullPointerException exemplo(quando seleciona um metodo de uma variavel que nao esta iniciada
 */

        Integer valor1 = null;
        /*
        nunca podemos usar uma variavel com o valor null = sempre pede para que se declare uma numeração
        nestes casos pra nao ocorrer um erro utilizamos os tipos primitivos
         */
        valor1.doubleValue();

    }
}
