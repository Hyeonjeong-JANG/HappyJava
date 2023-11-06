public class If03 {
    //if문 사용법3
    //else if 는 여러줄 추가될 수 있다.
    //if(조건문1){
    // 조건문1이 참일 경우 실행되는 블록
    // } else if(조건문2){
    // 조건문2가 참일 경우 실행되는 블록
    // } else{
    // 조건문1이나 조건문2에 해당되지 않을 경우 실행되는 블록
    // }

    public static void main(String[] args) {
        int score = 100;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        System.out.println("프로그램 종료!");
    }
}
