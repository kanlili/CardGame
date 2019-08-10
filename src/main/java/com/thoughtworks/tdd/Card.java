package com.thoughtworks.tdd;

public class Card {
    private  String number;
    private  char type;
    public  Card(String card){
        this.number=card.substring(0,1);
        this.type=card.charAt(card.length()-1);
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
