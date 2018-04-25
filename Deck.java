package com.cnu.blackjack;

import com.cnu.blackjack.com.cnu.blackjack.Suit;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private int numberOfDeck;
    private List<Card> cardList = new ArrayList<>();

    public Deck(int numberOfDeck) {
        this.numberOfDeck = numberOfDeck;
        createCard(numberOfDeck);

    }

    private void createCard(int numberOfDeck) {
        for(int j = 0; j<numberOfDeck; j++){
            for(int i = 1; i <14; i++){
                for(Suit suit : Suit.values()){
                    Card card = new Card(i, suit);
                    cardList.add(card);
                }
            }
        }
    }

    public int getTotalCardCount(){
        return 0;
    }

    public Card drawCard() {
        if(cardList.size() == 0)
            throw new NoMoreCardException();
        return cardList.remove(0);
    }
}
