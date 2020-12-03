
import java.util.Scanner;

public class VariavelReferencia {
    public static void main(String[] args) {

        System.out.println("Digite um numero: ");
        Scanner valor = new Scanner(System.in);

        Integer numero1 = valor.nextInt();

        System.out.println("Digite outro numero: ");
        Integer numero2 = valor.nextInt();

        // System.out.println("Digite o sinal da operação: / * - + " );
        // String operador = valor.nextLine();
        // switch (operacao) {
        //
        // case "/" : {
        // System.out.println(numero1 / numero2);
        // }
        // case "+" : {
        // System.out.println(numero1 + numero2);
        // }
        // case "-" : {
        // System.out.println(numero1 - numero2);
        // }
        // case "*" : {
        // System.out.println(numero1 * numero2);
        // }
        // }

        System.out.println();
    }

}
