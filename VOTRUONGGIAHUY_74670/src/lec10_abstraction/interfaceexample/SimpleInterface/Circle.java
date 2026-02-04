package lec10_abstraction.interfaceexample.SimpleInterface;
public class Circle implements IShape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }
}
