public class Main {

    public static void main(String[] args) {
        char grade = 'k';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz !");
                break;

            case 'B':
                System.out.println("Çok Güzel: Geçtiniz !");
                break;

            case 'C':
                System.out.println("İyi: Geçtiniz !");
                break;

            case 'D':
                System.out.println("Fena Değil: Geçtiniz !");
                break;

            case 'F':
                System.out.println("Berbat: Kaldınız !");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz.");
        }
    }
}
