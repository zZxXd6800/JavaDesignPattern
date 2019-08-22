package day1_design_principle.p5_open_close;

/**
 * 将Shape定义为抽象类，并提供一个抽象的draw方法让子类去实现
 * 新增图形种类时，只要继承Shape类并实现draw方法即可，
 */
public class OpenClose2 {
    public static void main(String[] args) {
        GraphicEditor2 editor = new GraphicEditor2();
        editor.drawShape(new Rectangle2());
        editor.drawShape(new Circle2());
        editor.drawShape(new Triangle2());
    }
}

class GraphicEditor2 {
    public void drawShape(Shape2 s) {
        s.draw();
    }
}

abstract class Shape2 {
    protected int mType;
    public abstract void draw();
}

class Rectangle2 extends Shape2 {
    public Rectangle2() {
        super.mType = 1;
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class Circle2 extends Shape2 {
    public Circle2() {
        super.mType = 2;
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}

/**
 * 新增三角形类
 */
class Triangle2 extends Shape2 {
    public Triangle2() {
        super.mType = 3;
    }

    @Override
    public void draw() {
        System.out.println("draw triangle");
    }
}