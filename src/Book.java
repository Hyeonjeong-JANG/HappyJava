/**
 * 책 한 권의 정보를 담기 위한 클래스
 * 
 * @author urstory(<a href="hyeonjeong.jang.0302@gmail.com">장현정</a>)
 * @since 2023.11
 * @version 0.1
 *///Java Doc 주석문

/*
자바 독 주석문을 작성하면 자바 도큐먼트를 만들 수 있다.
//자바독을 왜 만드냐?
//내가 만든 클래스를 남한테 제공해주고 설명을 보게 하려고 하는 것이다.

만드는 방법:
1. shift키를 2번 연속 누른다.
2. generate javadoc을 입력한다.
3. custom scope를 선택한 후 javadoc을 생성할 패키지, 클래스, 인터페이스 등을 선택한다. exclude를 선택해서 생성하지 않을 것들도 지정할 수 있다.
4. output directory에서 javadoc이 생성할 경로를 지정한다.
5. other command line arguments에는 다음을 입력한다.
   -encoding UTF-8 -charset UTF-8 -docencoding UTF-8

javadoc ascii art, UML ascii 이런거 검색하면 또 맛깔나게 주석달 수 있음.

*/


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

    /*
    필드의 값을 수정하고 얻기 위해 메소드를 만든다. setter, getter
    setter, getter - 프로퍼티(property)-price property
     */

    //price필드와 price프로퍼티의 차이점
    //필드는 클래스가 가지는 것이고, 프로퍼티는 getter setter 메소드를 말하는 것이다.

    
    /**
     * 책의 제목을 반환한다.
     * @return 책의 제목
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


//이 클래스는 몇 개의 프로퍼티를 가지고 있는가?
//title, price 2개를 가지고 있다.메소드에서 get,set 뒤에 붙은 단어로 말하는 것이다.