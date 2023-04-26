package oop2;

public class Triangle implements Shape{
    private int teihen;
    private int takasa;

    public Triangle(int x,int y){
        this.teihen = x;
        this.takasa = y;
    }
    @Override
    public int calculateArea(){
        return this.teihen * this.takasa / 2;
    }
}
