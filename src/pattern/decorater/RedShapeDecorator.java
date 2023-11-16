package pattern.decorater;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBoreder(decoratedShape);
    }
    private void setRedBoreder(Shape decoratedShape){
        System.out.println("Red =============== Start");
        decoratedShape.draw();
        System.out.println("Red =============== End");
    }
}
