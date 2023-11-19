package com.meryem.odev4;

public class Char_Switch_Case {
    public static void main(String[] args) {
        char not = 'B';

        switch (not) {
            case 'A':
                System.out.println("çok iyi");
                break;
            case 'B':
                System.out.println("iyi");
                break;
            case 'C':
                System.out.println("orta");
                break;
            case 'D':
                System.out.println("kötü");
                break;
            default:
                System.out.println("Geçersiz not");
                break;
        }
    }
}
