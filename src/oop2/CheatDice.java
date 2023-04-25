package oop2;

public class CheatDice extends Dice {

    public int CheatDice(int count) {
        super.random = super.cast();
        if (count % 6 == 0){
            super.random = 6;
        }
        return super.random;
    }

}
