public class User {
    private String email;
    private String password;
    private String name;

    //생성자를 하나라도 만들게 되면 기본 생성자가 만들어지기 않기 때문에 UserExam에 오류가 남.
    //그래서 UserExam을 이렇게 바꿔준다.
//    User user = new User("김성박", "urs@gmail.com");
    public User(String name,String email) {
//        this.name = name;
//        this.email = email;
        this(name,email,null);//코드의 중복 해결, 밑에보다 이게 숫자가 적으니 여기다가 해라.
        //그리고 this어쩌구를 제일 위에 해야한다. 안그러면 컴파일 에러 남.
    }

    //필드를 외부에서 사용하려면 getter setter 사용
    //getter만 사용하면 리턴만 가능하고 값이 변하지 않는다.(불변객체)
    //String클래스는 대표적인 불변객체로 스트링이 가진 모든 메소드는 스트링 내부의 값을 변화시키지 않는다.
    //password는 이러면 곤란

//생성자 오버로딩-생성자도 여러개를 가질 수 있다. 생성자는 매개변수의 개수가 다르거나, 타입이 다르다면 여러개를 가질 수 있다.
    public User(String name, String email, String password ) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //자신의 생성자를 호출할 때는 this()를 사용한다.
    //this는 인스턴스 자기 자신을 참조할 때 사용하는 키워드이다.
    //this() 생성자는 자기 자신의 생성자를 말한다.
    //this() 생성자는 생성자 안에서만 사용 가능하다. 메소드에서 사용 불가.
    //this() 생성자는 생성자 안에서 super() 생성자를 호출하는 코드 다음이나, 첫번째 줄에 위치해야 한다.

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {//password는 절대 금지
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
