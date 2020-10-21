public class Main {

    public static void main(String[] args) {

        try {

            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);

            //parametre olarak aşağıya gider ve yeni değerimiz o olur, println ın içine exception yazarsak hatayı verir
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Hata Oluştu ! Oluşan Hata =>" + exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hata Oluştu ! Oluşan Hata =>" + exception);
        } catch (Exception exception) {
            //Tüm hatalar buraya gider. Üsttekilere bakar oluşan hata üstte var ise girer yoksa en son buraya girer
            System.out.println("Loglandı: " + exception);
        } finally {
            System.out.println("Her türlü çalışırım bea :d ");

        }
    }
}