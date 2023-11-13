public class ItemForArray {//참조형 배열
    //ItemForArray는 불변클래스다.
    private int price;
    private String name;

    public ItemForArray(int price, String name) {
//
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


}
