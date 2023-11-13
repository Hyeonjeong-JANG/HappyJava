import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];//5개짜리 배열을 선언하고
        items[0] = new Item("JAVA", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("JS", 6000);
        items[4] = new Item("Dart", 2000);//0~4번째의 값을 초기화했음.

        //sort(Object[]) - Object는 모든 객체의 조상이니까 어떤 객체의 배열이든 올 수 있다.
//        Arrays.sort(items);//이렇게만 하면 ClassCastException 오류가 난다. 왜냐면 name이 기준인지 price가 기준인지 모르니까
        
        
//        1번 방식
//        Arrays.sort(items, new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                Item item1 = (Item) o1;
//                Item item2 = (Item) o2;
//                return item1.getName().compareTo(item2.getName());
//            }
//        });


//        2번 방식
//        Arrays.sort(items, (Object o1, Object o2)->{//람다 표현식
//            Item item1 = (Item) o1;
//            Item item2 = (Item) o2;
//            return item1.getName().compareTo(item2.getName());
//        });

//        3번 방식
        Arrays.sort(items,(item1,item2)->item1.getName().compareTo(item2.getName()));//줄다이다보면 이렇게까지 줄일 수 있어. 익숙해지자!!

        for (Item item : items) {
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator {
    //o1-o2 가 양수면 앞이 크고 반대면 뒤가 크다.
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return item1.getName().compareTo(item2.getName());
    }
}

class Item implements Comparable {//Comparable는 어떤 아이템이 큰지 작은지 기준을 정하는 인터페이스다

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    //compareTo에는 Object를 받아들이도록 했지만 실제로는 Item이 들어온다.
    //홍길동, 고길동 누가 더 크냐? 홍길동이 더 크다.
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item) o;
//        return this.name.compareTo(d.name);//양수, 0, 음수
//        //이렇게 하면 ABC으로 나오고 뒤에는 가나다순
//    }//이건 문자순
    @Override
    public int compareTo(Object o) {
        Item d = (Item) o;
        return this.price - d.price;//양수, 0, 음수
        //이렇게 하면 가격순
    }
}