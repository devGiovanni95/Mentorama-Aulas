package src.um;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VariavelCalendario {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();

        System.out.println(data.getTime());

        data.add(Calendar.MONTH, 1); //Adicionando 1 mes na data atual
        System.out.println(data.getTime());

        data.add(Calendar.DATE,5); //Calendar.DAY_OF_MONTH-----outro modo de adicionar dias // no caso esta adicionando 5 dias
        System.out.println(data.getTime());  //podemos colocar -5 para remover 5 dias

        data.set(Calendar.MONTH, Calendar.AUGUST); // setar a data com o mes de agosto
        System.out.println(data.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(sdf.format(data.getTime()));
    }
}
