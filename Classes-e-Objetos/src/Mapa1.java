package src;
import java.util.Map;
import java.util.TreeMap;
/*treemap  e pra quando se precisa de mais performace tendo os get executado mais rapidos*/
public class Mapa1 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");

        System.out.println(map.get("C"));
        System.out.println("Carro");

        System.out.println(map.get("M"));
        map.remove("M");

        System.out.println(map.get("M"));

    }
}
