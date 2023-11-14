import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {
//        TV tv= new LCDTV();
//        TV tv = ...;// 어떤 티브이 종류든 다 올 수 있다. 이런 개념으로 접근하면 됨.
        Collection<String> collection = new ArrayList<>();
//        Collection<String> collection = new HashSet<>();//이렇게해도 오키. 이때 순서가 바뀌어서 나오는데 List타입이 아니라면 어떤 순서로 나올지 알 수 없다!!
        //저기 뒷자리에는 Collection을 구현하고 있는 자료 구조는 올 수 있다.

        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()) {//꺼낼 것이 있냐? 없냐?
            String str = iter.next();
            System.out.println(str);
        }
    }
}//이거 상당히 뭐라는지 모르겠네. 컬렉션 프레임워크 핵심 인터페이스 그림을 보고 익히자.
