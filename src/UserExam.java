public class UserExam {
    public static void main(String[] args) {
//        User user=new User();//생성자가 없으면 아무 것도 없는 생성자가 자동으로 만들어지기 때문에 오류가 나지 않음.
        User user = new User("김성박", "urs@gmail.com");

        System.out.println(user.getName());
        System.out.println(user.getEmail());

        System.out.println(user);
        User user2=new User("홍길동", "hong@gmail.com","1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
        System.out.println(user2);

    }
}

