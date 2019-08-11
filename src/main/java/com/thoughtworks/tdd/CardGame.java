package com.thoughtworks.tdd;

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
}
