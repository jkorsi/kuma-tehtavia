/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethodgame;

/**
 *
 * @author eo388
 */
//Now we can extend this class in order to implement actual games: 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class RockPaperScissors extends Game {

    ArrayList<Integer> players;
    ArrayList<String> objList;

    ArrayList<Integer> rocks;
    ArrayList<Integer> papers;
    ArrayList<Integer> scissors;

    ArrayList<Integer> winners;

    ArrayList<Integer> tempWinnersRS;// = new ArrayList<>(players.size());
    ArrayList<Integer> tempWinnersRP;// = new ArrayList<>(players.size());
    ArrayList<Integer> tempWinnersSP;// = new ArrayList<>(players.size());
    ArrayList<Integer> tempWinnersR;// = new ArrayList<>(players.size());
    ArrayList<Integer> tempWinnersP;// = new ArrayList<>(players.size());
    ArrayList<Integer> tempWinnersS;// = new ArrayList<>(players.size());
    boolean end = false;

    /* Implementation of necessary concrete methods */
    @Override
    void initializeGame() {

        int c = playersCount;
        objList = new ArrayList<>(c + 1);
        players = new ArrayList<>(c + 1);

        tempWinnersRS = new ArrayList<>(players.size() + 1);
        tempWinnersRP = new ArrayList<>(players.size() + 1);
        tempWinnersSP = new ArrayList<>(players.size() + 1);
        tempWinnersR = new ArrayList<>(players.size() + 1);
        tempWinnersP = new ArrayList<>(players.size() + 1);
        tempWinnersS = new ArrayList<>(players.size() + 1);
        rocks = new ArrayList<>(players.size() + 1);
        scissors = new ArrayList<>(players.size() + 1);
        papers = new ArrayList<>(players.size() + 1);
        winners = new ArrayList<>(players.size() + 1);

        /*for (int i = 0; i < c; i++) {
            objList.add(i, null);
        }*/
        // ... 
    }

    @Override
    void makePlay(int player) {
        //At the beginning lets ask for every person to add R, R or S.
        if (objList.size() < 2 || objList.get(player) == null) {
            System.out.println("Player " + player);
            System.out.println("Choose: " + '\n'
                    + "R for Rock," + '\n'
                    + "P for Paper, or" + '\n'
                    + "S for Scissors");
            Scanner sc = new Scanner(System.in);
            String object = sc.nextLine();

            switch (object) {
                case "R":
                    objList.add(player, object);
                    rocks.add(player);
                    break;
                case "P":
                    objList.add(player, object);
                    papers.add(player);
                    break;
                case "S":
                    objList.add(player, object);
                    scissors.add(player);
                    break;
                default:
                    System.out.println("Answer can only be: R, P or S.");
                    System.out.println("Player not added.");
                    break;
            }

        } //PLS refactor me... :(
        else {

            if (rocks.size() < papers.size()) {
                papers.forEach((Integer i) -> {
                    tempWinnersP.add(i);
                });

            } else if (rocks.size() > scissors.size()) {

                rocks.forEach((Integer i) -> {
                    tempWinnersRS.add(i);
                });

            } else if (papers.size() < scissors.size()) {

                scissors.forEach((Integer i) -> {
                    tempWinnersSP.add(i);
                });
            } else if (papers.size() == rocks.size() && rocks.size() == scissors.size()) {
                scissors.forEach((Integer i) -> {
                    winners.add(i);
                });
                rocks.forEach((Integer i) -> {
                    winners.add(i);
                });
                papers.forEach((Integer i) -> {
                    winners.add(i);
                });
            } else if(papers.size() == scissors.size()){
                scissors.forEach((Integer i) -> {
                    tempWinnersS.add(i);
                });
            }else if(papers.size() == rocks.size()){
                papers.forEach((Integer i) -> {
                    tempWinnersP.add(i);
                });
            }else if(scissors.size() == rocks.size()){
                rocks.forEach((Integer i) -> {
                    tempWinnersR.add(i);
                });
            }
            
            end = true;
        }

    }

    @Override
    boolean endOfGame() {
        if (end) {
            return end;

        } else {
            return end;
        }
    }

    /*
    tempWinnersRS = new ArrayList<>(players.size()+1);
        tempWinnersRP = new ArrayList<>(players.size()+1);
        tempWinnersSP = new ArrayList<>(players.size()+1);
        tempWinnersR = new ArrayList<>(players.size()+1);
        tempWinnersP = new ArrayList<>(players.size()+1);
        tempWinnersS = new ArrayList<>(players.size()+1);
     */

    @Override
    void printWinner() {
        
        int max = findMax();
        ArrayList<ArrayList> aL = new ArrayList<>(6);
        aL.add(tempWinnersRS);
        aL.add(tempWinnersRP);
        aL.add(tempWinnersSP);
        aL.add(tempWinnersR);
        aL.add(tempWinnersP);
        aL.add(tempWinnersS);
        System.out.print("Winners are: ");
        for (ArrayList<Integer> a : aL) {
            System.out.println("loop 1");
            if (a.size() == max) {
                System.out.println("loop2");
                for (Integer i : a) {
                    
                    System.out.println("Adding to winners:");
                    winners.add(i);
                }
            }
        }
        for (Integer i : winners) {

            System.out.println(i);
        }

    }

    int findMax() {
        int max;
        ArrayList<Integer> maxL = new ArrayList<>(6);
        int r = tempWinnersR.size();
        int s = tempWinnersS.size();
        int p = tempWinnersP.size();
        int rs = tempWinnersRS.size();
        int rp = tempWinnersRP.size();
        int sp = tempWinnersSP.size();
        maxL.add(r);
        maxL.add(s);
        maxL.add(p);
        maxL.add(rs);
        maxL.add(rp);
        maxL.add(sp);

        max = Collections.max(maxL);

        return max;
    }
}
/*
ArrayList<Integer> tempWinnersRS = new ArrayList<>(players.size());
ArrayList<Integer> tempWinnersRP = new ArrayList<>(players.size());
ArrayList<Integer> tempWinnersSP = new ArrayList<>(players.size());
ArrayList<Integer> tempWinnersR = new ArrayList<>(players.size());
ArrayList<Integer> tempWinnersP = new ArrayList<>(players.size());
ArrayList<Integer> tempWinnersS = new ArrayList<>(players.size());

 */
