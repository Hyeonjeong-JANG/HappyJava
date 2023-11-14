public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();//<String>은 T라는 아직 정해져 있지 않는 클래스를 스티링 타입으로 쓰겠다 이거임.<>는 이것도 스트링으로 사용하겠다 이거임.
        //이렇게 하면 GenericBox에 있는 모든 T들이 스트링이 된다.
        genericBox.add("kim");
        String str = genericBox.get();//그러면 스트링으로 형변환을 하지 않아도 str을 받아서 그냥 스트링으로 실행된다.
        System.out.println(str.toUpperCase());

        //genericBox.add(new Integer(5)); //이미 스트링만 받을 수 있게 되어 있기 때문에 인티저를 쓰면 컴파일 오류가 발생한다.

        //인티저를 담을 수 있는 제네릭박스를 만들려면 아래와 같이 하고 이 경우 별도의 형변환 없이 인티저를 쓸 수 있게 된다.
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        //제네릭을 쓰면서 오브젝트타입으로도 쓸 수 있다.(오브젝트의 후손은 다 올 수 있다.)
        //그런데 이 때는 오브젝트 타입을 또 다른 타입으로 형변환해서 사용해야 한다.
        GenericBox<Object> objBox=new GenericBox<>();
        objBox.add("hello");
        String str2=(String) objBox.get();
        System.out.println(str2);

    }
}

//T는 제네릭과 관련된 부분이다.
//제네릭은 클래스 이름 뒤나, 메소드의 리턴타입 앞에 붙을 수 있다.
//<T>부분은 T라는 이름의 제네릭 타입을 선언한다는 것을 의미한다.
//T는 Type의 약자이기 때문에 많이 사용되는 문자이지 꼭 T를 쓸 필요는 없다.
//T가 아니가 E, D를 사용해도 된다.

//제네릭의 장점
//정해진 타입만 사용하도록 강제할 수 있다.
//타입을 강제함으로써 컴파일 할 때 잘못된 타입의 값이 저장되는 것을 막을 수 있다.
//형변환을 할 필요가 없다.