package com.solid.l.good;

public class GoodSquare implements Shape{
    private int side;
    public GoodSquare(int side){
        this.side=side;
    }

    @Override
    public int getArea() {
        return side*side;
    }
}
