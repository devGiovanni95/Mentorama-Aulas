package src.um;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariavelRegex {
    public static void main(String[] args) {
        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";
        /*
        define uma cadeia de string de codigo de como queremos procurar
         */

        String cpf = "487.548.258-65"; //criamos o string que queremos verificar
        String cpf1 = "487.548.258-lk5";


        Pattern pattern = Pattern.compile(regex);
        /*
        utilizar o Pattern para compilar o regex
         */
        Matcher match = pattern.matcher(cpf);
        Matcher match1 = pattern.matcher(cpf1);
        /*
        Utilizamos o Matcher pra verificar se esta disponivel ou nao na nossa string de texto
         */

        System.out.println(match.find());
        System.out.println(match1.find());
        /*
        Utilizamos o find para escrever na tela se esta igual respondendo = verdadeiro
        e reponder falso = para dados incorretos
         */

    }
}
