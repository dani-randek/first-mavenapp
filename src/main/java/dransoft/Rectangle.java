package dransoft;

import lombok.Getter;

public class Rectangle extends Quadrilateral {

    public Rectangle(int id, int a, int b) {
        super(id, a, b, a, b);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public float getArea() {
        return getA()*getB();
    }
}
