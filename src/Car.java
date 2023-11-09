public class Car {
    private String name;//필드는 가지는 것.
    @Override
    public String toString() {
        return "자동차!!";
    }

    public void run(){
        System.out.println("전륜구동으로 달린다.");
    }

    //생성자는 메소드와 비슷하다.
    //return type이 없다. 클래스 이름과 같아야 한다.
    //매개변수가 0개인 생성자를 기본 생성자라고 한다.
    //생성자가 하나도 없으면 아무 일도 안 하는 기본 생성자가 자동으로 만들어진다.
    public Car(){//생성자
        System.out.println("자동차가 한 대 생성됩니다.");
    }

    //이름을 가지고 인스턴스가 만들어지게 하고 싶다.
    public Car(String name){
        //클래스가 가지는 것은 필드다. 필드에도 네임을 선언해놔야한다.
        this.name=name;
    }
    public  void printName(){
        System.out.println("자동차 이름: "+name);
    }
}
