package oop2;

public class Rectangle implements Shape{
    private int teihen;
    private int takasa;

    public Rectangle(int x,int y){
        this.teihen = x;
        this.takasa = y;
    }

    public int calculateArea(){
        return this.teihen * this.takasa;
    }
}
