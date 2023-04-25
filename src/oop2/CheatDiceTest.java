package oop2;

public class CheatDiceTest {

    public static void main(String[] args) {
        CheatDice cheatDice = new CheatDice();
        for (var i = 1; i <= 30; i++){
            System.out.println(i + "回目"+cheatDice.CheatDice(i) + "/" + cheatDice.see());
        }
//        System.out.println(cheatDice.CheatDice(cheatDice.random));
    }
}
