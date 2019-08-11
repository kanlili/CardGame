package com.thoughtworks.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {

    private  static  String []cardNumber=new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    public int getIndex(String number){
        for(int i=0;i<cardNumber.length;i++){
            if(cardNumber[i].equals(number)){
                return i;
            }
        }
        return  -1;
    }
    public List<Card> sortFromSmallIndex(List<Card>card){
        List<Card>cardList=new ArrayList<>();
        for(String cardnumber:cardNumber){
            for(Card card1:card){
                if(cardnumber==card1.getNumber()){
                    cardList.add(card1);
                }
            }
        }
        return cardList;
    }
    public String compareCard(Card card1, Card card2) {
        String result1="";
        if(getIndex(card1.getNumber())>getIndex(card2.getNumber())){
            return result1+= "card1 won";
        }else if(getIndex(card1.getNumber())<getIndex(card2.getNumber())){
            result1+="card2 won";
        }else{
            result1+="平局";
        }
        return result1;
    }
    public String compareMutipCard(List<Card> cards1, List<Card> cards2) {
        String result="";
        List<Integer>cards1index=new ArrayList<>();
        List<Integer>cards2index=new ArrayList<>();
        sortFromSmallIndex(cards1);
        sortFromSmallIndex(cards2);
        for(Card card:cards1){
            cards1index.add(getIndex(card.getNumber()));
        }
        for(Card card:cards2){
            cards2index.add(getIndex(card.getNumber()));
        }
        for(int i=cards1index.size()-1;i>0;i--){
            for(int j=cards2index.size()-1;j>0;j--){

                if(cards1index.get(i)>cards2index.get(j)){
                    return  result+="card1 won";
                }else if(cards1index.get(i)==cards2index.get(j)){
                    if(cards1index.get(i-1)>cards2index.get(j-1)){
                        return  result+="card1 won";
                    }else if(cards1index.get(i-1)<cards2index.get(j-1)){
                        return  result+="card2 won";
                    }
                    return result+="平局";
                }
                result+="card2 won";
            }
        }
       return  result;
    }
}
