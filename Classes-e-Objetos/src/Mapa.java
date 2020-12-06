package src;

import java.util.HashMap;
/*HashMap e pra quando se precisa de mais memoria */

public class Mapa {
    public static void main(String[] args) {
        HashMap<String, String > map = new HashMap<>();
        map.put("C","Carro");
        map.put("M","Moto");
        map.put("B","Bicicleta");

        System.out.println(map.get("C"));
        System.out.println("Carro");

        System.out.println(map.get("M"));
        map.remove("M");

        System.out.println(map.get("M"));

    }
}
