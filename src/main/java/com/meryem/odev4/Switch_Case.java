package com.meryem.odev4;

public class Switch_Case {
    public static void main(String[] args) {
        /**
         * switch-case ifadeleri, belirli bir değişkenin değerine bağlı olarak
         * farklı durumları ele almak için kullanılan yapısal bir yapıdır. Bu ifadeler,
         * bir değişkenin farklı değerlerini kontrol eder ve her bir değer için farklı işlemleri gerçekleştirir.
         * Bu yapı, if-else if-else yapılarına alternatif bir yöntem sağlar ve kodun okunabilirliğini artırabilir.
         *
         * şu şekilde kullanılır:
         *
         * switch (değişken) {
         *     case değer1:
         *         // Değişken değeri değer1'e eşitse buradaki kod çalışır
         *         break;
         *     case değer2:
         *         // Değişken değeri değer2'ye eşitse buradaki kod çalışır
         *         break;
         *     // Diğer case ifadeleri
         *     default:
         *         // Yukarıdaki hiçbir case ifadesiyle eşleşmezse buradaki kod çalışır
         *         break;
         *      }
         *
         * -> switch: Değişkenin değerine göre durumları kontrol etmek için kullanılır.
         * -> case: Belirli bir değeri kontrol etmek için kullanılır. Eğer değişkenin değeri case
         * ifadesiyle eşleşiyorsa, o durumdaki kod bloğu çalışır.
         * -> break: Her bir case bloğunun sonunda bulunur. break ifadesi, bir durumun işlendiğini ve
         * döngünün sona ermesi gerektiğini belirtir. Aksi takdirde, diğer durumlar da çalıştırılır.
         * -> default: Eğer hiçbir case ifadesiyle eşleşme olmazsa, default bloğundaki kod çalışır.
         * default bloğu zorunlu değildir, isteğe bağlıdır.
         *
         */

        //Ornek
        int gun = 2;
        String gunAdi;

        switch (gun) {
            case 1:
                gunAdi = "Pazartesi";
                break;
            case 2:
                gunAdi = "Salı";
                break;
            case 3:
                gunAdi = "Çarşamba";
                break;
            case 4:
                gunAdi = "Perşembe";
                break;
            case 5:
                gunAdi = "Cuma";
                break;
            default:
                gunAdi = "Hafta içi değil";
                break;
        }

        System.out.println("Bugün " + gunAdi);
    }

}
