package com.solid.l.good;

public class GoodRectangle implements Shape{
    private int height;
    private int width;
    public GoodRectangle(int height, int width){
        this.height=height;
        this.width=width;
    }
    @Override
    public int getArea(){
        return height*width;
    }
}
