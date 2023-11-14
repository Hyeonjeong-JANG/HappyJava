public class GenericBox<T> {//꺽쇠의 의미는 T라는 아직 정해지지 않은 타입을 사용하겠다. 보통 type의 약자인 T를 많이 쓰고 다른 이름을 써도 좋음.
 private T t;//티타입으로 받아서

 public void add(T obj){
     this.t=obj;
 }

 public T get(){//티타입으로 꺼낸다.
     return this.t;
 }
}
