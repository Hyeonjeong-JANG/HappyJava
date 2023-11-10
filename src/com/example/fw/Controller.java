package com.example.fw;/*
Controller의 '종류'가 여러개더라.
* 초기화 - 같은 코드
* 실행 - 다른 코드?
* 마무리- 같은 코드

초기화, 마무리 코드는 꼭 넣어라!! 라고 했는데 까먹은 것이여.
그래서 아... 자꾸 까먹네... 초기화, 마무리 코드는 항상 들어가 있고
실행 코드만 입력하게 하면 얼마나 좋을까?
하다보니 abstract이용해서 컨트롤러 클래스를 부모로부터 상속받게 해야겠다. 이러는 거야.
*/

public abstract class Controller {
    protected final void init(){//초기화하는 코드
        //final이 붙은 메소드는 overriding이 금지됨.
        System.out.println("초기화 하는 코드");
        
    }
    protected final  void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run();//매번 다른 코드

    public void execute(){//여기에 실행 순서를 적어.
        //내가 가지고 있는 메소드를 호출한다.
        //어떤 순서를 가지고 있으며 이런 메소드를 템플릿 메소드라고 한다.
        //초기화
        //실행
        //마무리
        this.init();//this생략 가능
        this.run();
        this.close();
    }
}
