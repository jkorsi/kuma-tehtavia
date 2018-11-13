package templatemethodgame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eo388
 */

public class Main {
    public static void main(String[] args){
        RockPaperScissors game = new RockPaperScissors();
        game.initializeGame();
        game.playOneGame(2);
        
    }
}
