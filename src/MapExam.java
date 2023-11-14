import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//map은 제네릭으로 사용하면 <key, value> 두 가지가 들어간다.
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요");//map의 key도 이퀄스와 해시코드를 구현해 주고 있어야 한다. 스트링 값이 키가 될 수 있는 것은 이 스트링 객체도 해시코드, 이퀄스를 구현해주고 있기 때문이다.
        //같은 키값이 있으면 덮어쓴다. 안녕하세요 나옴.

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));//각각 k1,k2,k3에 해당하는 키값이 출력된다.

    }
}
