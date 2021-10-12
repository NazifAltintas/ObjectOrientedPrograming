package be.intecbrussel;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random myInteger = new Random(9);
        System.out.println(myInteger.nextInt(45));
        Random myInteger1 = new Random();
        System.out.println(myInteger.nextInt(45) - 20);
        Random myInteger2 = new Random();
        System.out.println(myInteger.nextInt(45));
        Random myInteger3 = new Random();
        System.out.println(myInteger.nextInt(45));
        Random myInteger4 = new Random();
        System.out.println(myInteger.nextInt(45));
        Random myInteger5 = new Random();
        System.out.println(myInteger.nextInt(45));

        // Random kullanarak 1 ile 49 arasında rastgele sayilar tutan.
        // Bunları 6 elemanlı dizi içerisine yerleştiren kodu yazınız.

        // Dizi içerisindeki sayıları ekranda gösteriniz.

        // Tutulan bir sayı tekrar tutulmamalı, yani 6 farklı sayı elde etmek istiyoruz.

//        ben random ile rasgele sayı atayıp dizeye atıp ekrana yazdırdım ama sayılar tekrarlarınıyor . bu kısmı nasıl yapabilirim .
//
//        kod kısmı :

// Öncelikle; rastgele olarak tutacağımız 6 sayının yerleştirileceği bir tamsayi dizisine ihtiyacımız var.
        int[] sayilar = new int[6];


        // Dizi oluşturulduktan sonra, dizi içerisine atanacak değerleri rastgele olarak seçecek olan Random nesnesini hafızaya çıkaralım.
        Random r = new Random();


        // 6 defa sayı tutmamız gerektiği için, 6 tur dönecek bir döngü hazırlayalım.
        // Bu döngü için 6 sabit değerini değil, daha önce oluşturulan dizinin eleman sayısını kullanalım.
        for (int i = 0; i < sayilar.length; i++) {


            if (sayilar.equals(sayilar[i])) {

                sayilar[i] = r.nextInt(49) + 1;

            } else {
                sayilar[i] = r.nextInt(49) + 1;
            }


        }
        // Döngünün her turunda rastgele bir değer üretelim ve sıradaki elemana değer ataması yapalım.


        // Dizi içerisindeki elemanları ekranda göstermek için bir döngüye ihtiyacımız var.


        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]);

            if (i < sayilar.length - 1) {
                System.out.print("-");

            }
        }
        System.out.println();
        int[] sayilar1; // diziyi tanımladık
        sayilar1 = new int[6]; // elaman sayısını belirledik
        Random ra = new Random(); // random nesnesini oluşturduk


        for (int i = 0; i < sayilar1.length; i++) { //değer atamak için döngü oluşturuldu.

            do { // ilk seferde kontrolsüz girmesi için do-while döngüsünü seçtik
                sayilar1[i] = r.nextInt(49) + 1; // random sayıyı atadık
            } while (sayilar1.equals(sayilar1[i])); // atanan sayı dizi içinde bulunmadığında döngüden çıktık

        }

        // sayıları yazdırdık
        System.out.print(sayilar1[0] + "-");

        // sayıları yazdırdık
        System.out.print(sayilar1[1] + "-");

        // sayıları yazdırdık
        System.out.print(sayilar1[2] + "-");

        // sayıları yazdırdık
        System.out.print(sayilar1[3] + "-");

        // sayıları yazdırdık
        System.out.print(sayilar1[4] + "-");

        // sayıları yazdırdık
        System.out.println(sayilar1[5]);

    }

}





