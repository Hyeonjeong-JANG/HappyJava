import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 500));
        mySet.add(new MyData("lee", 200));
        mySet.add(new MyData("hong", 700));
        mySet.add(new MyData("hong", 700));//하나 더 하면 순서는 어떻게 나올지 모르지만 홍700이 하나 더 생겨서 나온다. 왜 그럴까?
// 각각의 객체들의 해시코드와 이퀄스메소드가 비교되면서 각각의 데이터가 같은지 다른지 비교해 주는데 여기서 MyData클래스는 해시태그와 이퀄스가 없다. 그래서 MyData 부모의 오브젝트의 것을 사용하게 되는데 오브젝트의 해시태그와 이퀄스는 아무짝에도 쓸모가 없다. 그래서 중복으로 저장되는 것이다.
//해시 알고리즘을 사용하고 싶으면 해시태그와 이퀄스를 오버라이딩 해줘야 한다.
//오버라이딩을 해주면 중복된 것은 하나로 저장되어서 4건이 아니라 3건이 저장된다.
        Iterator<MyData> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            MyData myData = iterator.next();
            System.out.println(myData);
        }

//        Iterator<MyData> iterator = mySet.iterator();
//        while (iterator.hasNext()) {
//            MyData myData = iterator.next();
//        }//이터레이터를 사용하는 방식은 항상 이렇기 때문에 익혀둬라.
    }
}

class MyData {
    private String name;
    private int value;

    public MyData(String name, int value) {

        this.name = name;
        this.value = value;

    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals!!!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode!!!");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }//오버라이딩을 하지 않으면 막 이상한 글자들이 나오니까 꼭 해줘야 한다.

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}