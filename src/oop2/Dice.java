package oop2;

import java.util.Random;

public class Dice {
    protected int random = 0;
    Random rand = new Random();

    //サイコロを振るメソッド
    public int cast() {
        random = rand.nextInt(6) + 1;
        return random;

    }

    //出目を確認する
    public int see() {

        if (this.random == 0){
            return 1;
        }else {
            return random;
        }
    }

}
