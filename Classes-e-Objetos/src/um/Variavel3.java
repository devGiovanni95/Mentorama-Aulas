package src.um;

public class Variavel3 {
    public static void main(String[] args) {
        char vetores[] = {'M', 'e', 'n'};
        String texto = String.valueOf(vetores);
        System.out.println(texto);

        long longConvertido = 12;
        String valor = String.valueOf(longConvertido);
        System.out.println(valor);

        Double valorDouble = Double.valueOf(valor); //tomar cuidado para nao converter texto e valor doule para nao dar erro no codigo

        System.out.println(valorDouble);
    }
}
