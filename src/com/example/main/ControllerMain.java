package com.example.main;

import com.example.fw.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();//사용자가 실수로 c1.init();하면 초기화하는 코드만 실행돼. 사용자가 직접 호출하면 되는 코드는 execute();야. c1.찍었을 때 아래로 execute()만 뜨게 강제하는 방법은? Controller.java에 가서 init, close, run에 protected라고 바꿔주면 됨.
        //protected는 같은 package이거나 상속받았을 경우에 접근이 가능하다.
    }
}