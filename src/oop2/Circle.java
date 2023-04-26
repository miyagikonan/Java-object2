package oop2;

public class Circle implements Shape {


    private int hankei;

    public Circle(int x){
        this.hankei = x;
    }

    @Override
    public int calculateArea(){
        return (int)(Math.PI * this.hankei * hankei);
    }
}
