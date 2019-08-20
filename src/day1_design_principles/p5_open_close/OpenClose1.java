package day1_design_principles.p5_open_close;

public class OpenClose1 {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}

/**
 * 用于绘图的类（使用方），需要新增drawTriangle()方法并且修改原有的drawShape()方法，违反了开闭原则
 */
class GraphicEditor {
    public void drawShape(Shape s) {
        switch (s.mType) {
            case 1:
                drawRectangle();
                break;
            case 2:
                drawCircle();
                break;
            case 3:
                drawTriangle();
                break;
            default:
                break;
        }
    }

    private void drawRectangle() {
        System.out.println("draw rectangle");
    }

    private void drawCircle() {
        System.out.println("draw circle");
    }

    private void drawTriangle() {
        System.out.println("draw triangle");
    }
}

class Shape {
    int mType;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.mType = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.mType = 2;
    }
}

/**
 * 新增三角形类
 */
class Triangle extends Shape {
    public Triangle() {
        super.mType = 3;
    }
}