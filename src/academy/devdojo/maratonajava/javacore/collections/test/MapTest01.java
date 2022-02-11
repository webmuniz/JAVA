package academy.devdojo.maratonajava.javacore.collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //LinkedHashMap<>() - mantém ordem de inserção.
        map.put("teklado","teclado");
        map.put("mause","mouse");
        map.put("vc","você");
        map.putIfAbsent("vc2","você"); //não sobrescreve

        for (String key : map.keySet()){
            System.out.println(key + " : "+ map.get(key));
        }

        System.out.println("=================");
        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("=================");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
