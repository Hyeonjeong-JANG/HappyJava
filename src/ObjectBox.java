public class ObjectBox {
    public Object object;

    public void set(Object obj){//필드에 오브젝트를 받아들이기로 했다면 오브젝트만 들어오는 것이 아니라 오브젝트의 후손들은 모두다 들어올 수 있는거야.
        this.object=obj;
    }

    public Object get(){
        return this.object;
    }
}