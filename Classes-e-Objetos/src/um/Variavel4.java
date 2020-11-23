package src.um;

public class Variavel4 {
    public static void main(String[] args) {
        String texto = "Mentorama - Java";
        String texto1 = "Mentorama - JAVA";
        System.out.println(texto.charAt(0));

        System.out.println(texto.compareTo(texto1));   //se resposta for diferente - 32
        System.out.println(texto.compareToIgnoreCase(texto1));  //se resposta for igual - 0

        System.out.println(texto.equals(texto1));   //se resposta for diferente - false
        System.out.println(texto.equalsIgnoreCase(texto1));  //se resposta for igual - true

        System.out.println(texto.startsWith("Men"));   //se o texto começa com "Men"
        System.out.println(texto.endsWith("Java"));   //se o texto termina com "Java"

        String[] textos = texto.split("-");
        for(String t: textos) {
            System.out.println(t);
            /* o split é utilizado para quebrar textos no caso selecionando o "-"
            selecionamos o caractere que queremos sepoarar ficando assim:
            Mentorama
              Java
             */

            System.out.println(t.toLowerCase()); //transforma tudo em letras minusculas
            System.out.println(t.toUpperCase()); // transforma tudo em letras maiusculas
            System.out.println("." + t + ".");
            System.out.println("." + t.trim() + ".");  //retira os espaços existentes

        }

        System.out.println(texto.isEmpty());   //pergunta se o texto esta vazio

        String vazia = "";
        System.out.println(vazia.isEmpty());

        System.out.println(texto.substring(1,3));
        /*
        pega determinado trecho escolhido do texto
        por exemplo: o primeiro numero 1 é a posiçao nque ele comecara
        e o 3 comeca contar da pavra inteira de mentorama   1=e ; e o 3 conta domecando do m como numero 1,
        e numero 2 , n como numero 3
*/

        System.out.println("Carro " + "Veloz");     //concatena palavras
        System.out.println("Carro ".concat("Veloz"));

    }

}
