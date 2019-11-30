import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        System.out.println(map.get("a"));
        System.out.println(map.getOrDefault("a","没有"));
        String oldValue = map.put("a","1");
        System.out.println(oldValue);
        oldValue = map.put("a","2");
        System.out.println(oldValue);

        map.put("b","3");
        map.put("c","4");

        System.out.println(map.keySet());
        for(String key:map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.values());
        for(String value:map.values()) {
            System.out.println(value);
        }

        System.out.println(map.entrySet());
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("d"));
        System.out.println(map.containsValue("2"));
    }
}
