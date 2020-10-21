public class Main {

    public static void main(String[] args) {
        int sayi = 33550336;
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println(toplam + " Sayısı Mükemmel sayıdır.");
        } else
            System.out.println(toplam + "Sayı mükemmel sayı değildir");
    }
}
