package dransoft;

import lombok.Getter;

public class Square extends Quadrilateral {

    public Square(int id, int a) {
        super(id, a, a, a, a);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public float getArea() {
        return getA()*getA();
    }
}
