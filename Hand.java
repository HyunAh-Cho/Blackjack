package com.cnu.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private Deck deck;
    private List<Card> handList = new ArrayList<>();

    public Hand(Deck deck){
        this.deck = deck;
    }
    public Card drawCrad() {
        Card card = deck.drawCard();
        handList.add(card);
        return card;
    }

    public int getCurrentHandSize() {
        return handList.size();
    }
}
