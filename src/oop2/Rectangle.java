package oop2;

public class Rectangle implements Shape{
    private int yoko;
    private int tate;

    public Rectangle(int x,int y){
        this.yoko = x;
        this.tate = y;
    }

    @Override
    public int calculateArea(){
        return this.yoko * this.tate;
    }
}
