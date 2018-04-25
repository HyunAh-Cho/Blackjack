package com.cnu.blackjack;

import com.cnu.blackjack.com.cnu.blackjack.Suit;
import lombok.Data;

@Data
public class Card {


    private int rank;
    private Suit suit;


    public Card(int rank, Suit suit) {
        if(rank > 13){
            throw new NoRackException();
        }
        this.rank = rank;
        this.suit = suit;
    }

//    public int getRank() {
//        return this.rank;
//    }
//
//    public String getSuit() {
//        return this.suit;
//    }
}
