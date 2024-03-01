package HashMaps;

import java.util.HashMap;

public class Itinerray {
    static String getStart(HashMap<String, String> map) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : map.keySet()) {
            revMap.put(map.get(key), key);
        }

        for(String key : map.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String startPoint = getStart(map);

        while(map.containsKey(startPoint)) {
            System.out.print(startPoint + " -> ");
            startPoint = map.get(startPoint);
        }
        System.out.print(startPoint);
    }
}