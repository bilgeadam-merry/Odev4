package com.meryem.odev4;

public class Enum_Switch_Case {
    public static void main(String[] args) {
        enum HaftaGunleri {
            PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
        }

        HaftaGunleri gun = HaftaGunleri.CARSAMBA;

        switch (gun) {
            case PAZARTESI:
            case SALI:
            case CARSAMBA:
            case PERSEMBE:
            case CUMA:
                System.out.println("Hafta içi günü!");
                break;
            case CUMARTESI:
            case PAZAR:
                System.out.println("Hafta sonu günü!");
                break;
        }
    }
}
