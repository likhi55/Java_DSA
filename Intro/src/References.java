import java.util.HashMap;

public class References {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("value", 1);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2 = map1;

        System.out.println(map1.get("value"));
        System.out.println(map2.get("value"));

        map2.replace("value", 2);

        System.out.println(map1.get("value"));
        System.out.println(map2.get("value"));
    }
}
