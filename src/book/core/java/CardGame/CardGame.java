package book.core.java.CardGame;

import java.util.*;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-5.
 */
public class CardGame {
    public void start(){
        Cards cs = new Cards();
        cs.init();
        Player tom = new Player("Tom");
        Player jerry = new Player("Jerry");
        Dealer d = new Dealer();
        d.deal(tom, cs);
        d.deal(jerry, cs);
        d.deal(tom, cs);
        d.deal(jerry, cs);
        tom.showHands();
        jerry.showHands();
        d.showWinner(tom, jerry);
    }

    public static void main(String[] args) {
        CardGame cd = new CardGame();
        cd.start();
    }
}

class Cards{
    final String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    final String[] suit = {"黑桃","梅花","方块","红桃"};
    private ArrayList<Card> all = new ArrayList(52);

    public void init(){
        System.out.println("Game start, init the card now.");
        for (String s : suit){
            for(String n : number){
                all.add(new Card(n, s));
            }
        }
        System.out.println(all.toString());
    }

    public ArrayList<Card> getAll(){
        return all;
    }

    public String[] getNumber() {
        return number;
    }

    public String[] getSuit() {
        return suit;
    }

}

class Card implements Comparable{
    private String number;
    private String suit;

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }


    public int getNumberId(Cards cs){
        for (int i = 0; i < cs.getNumber().length; i++) {
            if(cs.getNumber()[i].equals(number)){
                return i;
            }
        }
        return -1;
    }

    public int getSuitId(Cards cs){
        for (int i = 0; i < cs.getSuit().length; i++) {
            if(cs.getSuit()[i].equals(suit)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return suit+number;
    }
    @Override
    public int compareTo(Object o) {
        Cards cs = new Cards();
        if(this.getNumberId(cs) > ((Card) o).getNumberId(cs)){
            return 1;
        }
        else if(this.getNumberId(cs) < ((Card) o).getNumberId(cs)){
            return -1;
        }
        else{
            if(this.getSuitId(cs) > ((Card) o).getSuitId(cs)){
                return 1;
            }
            else if(this.getSuitId(cs) < ((Card) o).getSuitId(cs)){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}

class Player{
    private Card[] hands = new Card[2];
    private int id = 0;
    private String name;
    private Card Maxhand;
    private static int playerNumber = 0;

    public Player(String name) {
        this.name = name;
        System.out.println("Welcome Player"+Player.getPlayerNumber()+", his name : "+ name);
    }

    public void addCard(Card c){
        hands[id] = c;
        id++;
    }

    public void showHands(){
        Arrays.sort(hands);
        Maxhand = hands[1];
        System.out.println(name +": " + Arrays.toString(hands) + " Max hand:" + Maxhand);
    }

    public static int getPlayerNumber(){
        playerNumber++;
        return playerNumber;
    }

    public Card getMaxhand() {
        return Maxhand;
    }
}

class Dealer{
    private int cardNumber;

    public void deal(Player p, Cards cs){
        double tmp = Math.random()*cs.getAll().size();
        cardNumber = (int) tmp;
        Card chosen = cs.getAll().get(cardNumber);
        p.addCard(chosen);
    }

    public void showWinner(Player p1, Player p2){
        if(p1.getMaxhand().compareTo(p2.getMaxhand()) == 1){
            System.out.println("Tom win the game");
        }
        else{
            System.out.println("Jerry win the game");
        }
    }

}

