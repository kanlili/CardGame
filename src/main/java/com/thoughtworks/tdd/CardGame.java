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
        return getIndex(card1.getNumber())==getIndex(card2.getNumber())?  "平局" :
                (getIndex(card1.getNumber())>getIndex(card2.getNumber())?  "card1 won" : "card2 won" );

    }
    private void sortFromsmallIndex(List<Card> cards1, List<Card> cards2) {
        sortFromSmallIndex(cards1);
        sortFromSmallIndex(cards2);
    }
    public String compareMutipCard(List<Card> cards1, List<Card> cards2) {
        String result="";
        sortFromsmallIndex(cards1, cards2);
        List<Integer>cards1index=new ArrayList<>();
        List<Integer>cards2index=new ArrayList<>();
        for(Card card:cards1){
            cards1index.add(getIndex(card.getNumber()));
        }
        for(Card card:cards2){
            cards2index.add(getIndex(card.getNumber()));
        }
        for(int i=cards1index.size()-1;i>0;i--){
            for(int j=cards2index.size()-1;j>0;j--){
                if(cards1.get(i).getNumber().equals(cards1.get(i-1).getNumber())&&cards2.get(j).getNumber().equals(cards2.get(j-1).getNumber())){
                    return  getIndex(cards1.get(i).getNumber())==getIndex(cards2.get(j).getNumber()) ? "平局":
                            (getIndex(cards1.get(i).getNumber())>getIndex(cards2.get(j).getNumber()) ? "card1 won": "card2 won" );
                }else if(cards1.get(i).getNumber().equals(cards1.get(i-1).getNumber())){
                    return  result+="card1 won";
                }else if(cards2.get(j).getNumber().equals(cards2.get(j-1).getNumber())){
                    result+="card2 won";
                }else{
                   if(cards1index.get(i)>cards2index.get(j)){
                    return  result+="card1 won";
                   }else if(cards1index.get(i)==cards2index.get(j)){
                    return cards1index.get(i-1)==cards2index.get(j-1) ? "平局":
                            (cards1index.get(i-1)>cards2index.get(j-1) ? "card1 won": "card2 won");
                  }
                    result+="card2 won";
                }

            }
        }
       return  result;
    }


}
