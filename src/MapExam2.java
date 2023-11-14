import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}

//키들이 모두 모이면 셋 자료구조
//셋 자료구조에서 모든 것을 꺼내려면 이터레이터를 사용한다.
//맵에서 값을 꺼내려면  키?케이?를 이용해서 꺼낸다.