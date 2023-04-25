package oop2;

public class DiceTest {

    public static void main(String[] args){
        Dice dice = new Dice();
        dice.cast();
        dice.see();
        for (var i = 0; i < 30; i++){
            System.out.println(dice.cast());

        }
        System.out.println(dice.see());
    }
}
