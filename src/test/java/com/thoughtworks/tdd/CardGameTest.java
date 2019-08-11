package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    @Test
    public void should_return_card2won_when_call_function_given_2S3D_3C4D(){
        List<Card>cards1= new ArrayList<>();
        cards1.add(new Card("2S"));
        cards1.add(new Card("3D"));
        List<Card>cards2= new ArrayList<>();
        cards2.add(new Card("3C"));
        cards2.add(new Card("4D"));
        CardGame cardGame=new CardGame();
        String result=cardGame.compareMutipCard(cards1,cards2);
        Assertions.assertEquals("card2 won",result);
    }
    @Test
    public  void should_return_card2won_when_call_function_given_4D2S_3C4D(){
        List<Card>cards1= new ArrayList<>();
        cards1.add(new Card("4D"));
        cards1.add(new Card("2S"));
        List<Card>cards2= new ArrayList<>();
        cards2.add(new Card("3C"));
        cards2.add(new Card("4D"));
        CardGame cardGame=new CardGame();
        String result=cardGame.compareMutipCard(cards1,cards2);
        Assertions.assertEquals("card2 won",result);
    }
    @Test
    public void should_return_card2won_when_call_function_given_2SAD_2S2S(){
        List<Card>cards1= new ArrayList<>();
        cards1.add(new Card("2S"));
        cards1.add(new Card("AD"));
        List<Card>cards2= new ArrayList<>();
        cards2.add(new Card("2S"));
        cards2.add(new Card("2S"));
        CardGame cardGame=new CardGame();
        String result=cardGame.compareMutipCard(cards1,cards2);
        Assertions.assertEquals("card2 won",result);
    }
    @Test
    public void should_return_card2won_when_call_function_given_2D3S7H8SAD_2D6S4D5D5D(){
        List<Card>cards1= new ArrayList<>();
        cards1.add(new Card("2D"));
        cards1.add(new Card("3S"));
        cards1.add(new Card("7H"));
        cards1.add(new Card("8S"));
        cards1.add(new Card("AD"));
        List<Card>cards2= new ArrayList<>();
        cards2.add(new Card("2D"));
        cards2.add(new Card("6S"));
        cards2.add(new Card("4D"));
        cards2.add(new Card("5D"));
        cards2.add(new Card("5D"));
        CardGame cardGame=new CardGame();
        String result=cardGame.compareMutipCard(cards1,cards2);
        Assertions.assertEquals("card2 won",result);
    }
    @Test
    public void should_return_card2won_when_call_function_given_2D2D4D5DAD_2D2D4D5D5D(){
        List<Card>cards1= new ArrayList<>();
        cards1.add(new Card("2D"));
        cards1.add(new Card("2D"));
        cards1.add(new Card("4D"));
        cards1.add(new Card("5D"));
        cards1.add(new Card("AD"));
        List<Card>cards2= new ArrayList<>();
        cards2.add(new Card("2D"));
        cards2.add(new Card("2D"));
        cards2.add(new Card("4D"));
        cards2.add(new Card("5D"));
        cards2.add(new Card("5D"));
        CardGame cardGame=new CardGame();
        String result=cardGame.compareMutipCard(cards1,cards2);
        Assertions.assertEquals("card2 won",result);
    }
}
