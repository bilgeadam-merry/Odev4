package com.meryem.odev4;

public class String_Switch_Case {
    public static void main(String[] args) {

        String gun = "Cumartesi";
        String gunTuru;

        switch (gun) {
            case "Pazartesi":
            case "Salı":
            case "Çarşamba":
            case "Perşembe":
            case "Cuma":
                gunTuru = "Hafta içi";
                break;
            case "Cumartesi":
            case "Pazar":
                gunTuru = "Hafta sonu";
                break;
            default:
                gunTuru = "Geçersiz gün";
                break;
        }

        System.out.println(gun + " " + gunTuru);
    }
}
