public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("kim");
        String str = (String) box.get();//오브젝트로 받음
        System.out.println(str.toUpperCase());

        box.set(new Integer(5));
        Integer i = (Integer) box.get();//원래 타입으로 바꿈
        System.out.println(i.intValue());
    }
}

//오브젝트박스는 오브젝트와 그의 후손들은 받을 수 있기고
//꺼낼 때는 원래 타입으로 바꿔줘야 한다.
//단점!! 조금 번거로움. 좀 범용적인 느낌의 박스로 만들어 볼까?
//형변환도 할 수 없고, 타입을 지정할 수 있는 상자를 만들어보자!!
//그래서 등장한 것이 제네릭!! GenericBox를 보자!!