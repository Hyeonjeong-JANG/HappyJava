public class Book {
    private String title;
    private int price;//field price

    public int getPrice() {
        return this.price * 2;//this를 써주면 이 필드를 말해. this는 내 자신 인스턴스를 참조하는 예약어.
        //this는 static메소드에서 사용할 수 없다.
    }

    public void setPrice(int price) {//지역변수 price
        this.price = price;//this.price: 인스턴스 변수
    }
    //필드의 값을 수정하고 얻기 위해 메소드를 만든다. setter, getter
    //setter, getter - 프로퍼티(property)-price property

    //price필드와 price프로퍼티의 차이점
    //필드는 클래스가 가지는 것이고, 프로퍼티는 getter setter 메소드를 말하는 것이다.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


//이 클래스는 몇 개의 프로퍼티를 가지고 있는가?
//title, price 2개를 가지고 있다.메소드에서 get,set 뒤에 붙은 단어로 말하는 것이다.