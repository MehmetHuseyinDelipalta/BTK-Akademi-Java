public class Main {

    public static void main(String[] args) {
        int number = -10;
        int i = 2;
        if (number < 2) {
            System.out.println("Geçersiz sayı girdiniz.");
        } else {
            while (i < number) {
                //reminder=>kalanı veren değşik bir mantığı var
                int remainder = number % i;
                if (remainder == 0) {
                    System.out.println("Tam bölen sayı:" + i + " Asal sayı değildir.");
                }
                i++;
            }
            System.out.println("Sayı asaldır.");
        }
    }
}
