package com.app;

public class NumberTranslator {

    public String translateNumber(int number){
        switch (number){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
        }
        return null;
    }

}
