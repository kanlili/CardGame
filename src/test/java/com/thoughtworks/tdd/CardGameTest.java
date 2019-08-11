package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardGameTest {
    @Test
    public void should_ruturn_card2_when_call_function_given_2S_AD(){
        // Card card1=new Card("2","S");
        Card card1=new Card("2S");
        Card card2=new Card("AD");
        CardGame cardGame=new CardGame();
        String result=cardGame.compareCard(card1,card2);
        Assertions.assertEquals("card2 won",result);

    }
}
