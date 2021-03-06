package com.example.kelseyde.cardgame;

import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class GameTest {

    Player player1;
    Player player2;
    Player player3;
    ArrayList<Player> players;
    Game game;
    Deck deck;

    @Before

    public void before() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        players = new ArrayList();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        game = new Game(players);
        deck = new Deck();
    }

    @Test
    public void testWinner() {
        deck.newDeck();
        deck.dealCards(players);
        assertEquals(player3, game.getWinner(players));
    }



}