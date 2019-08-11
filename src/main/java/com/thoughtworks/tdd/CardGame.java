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
    public int sortFromSmallIndex(List<Card>card){
        List<Integer>numberList=new ArrayList<>();
        for(Card card1:card) {
          numberList.add(getIndex(card1.getNumber()));
        }
        numberList.stream().sorted().collect(Collectors.toList());
        int max=numberList.get(numberList.size()-1);
        return max;
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
        if(sortFromSmallIndex(cards1)>sortFromSmallIndex(cards2)){
            return  result+="card1 won";
        }else if(sortFromSmallIndex(cards1)<sortFromSmallIndex(cards2)){
            return  result+="card2 won";
        }
        return  "平局";
    }
}
