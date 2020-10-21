public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);



        /*//uzunluğu verir
        System.out.println("Eleman sayıs:" + mesaj.length());
        //indexi verir
        System.out.println("5. eleman: " + mesaj.charAt(4));
        //yeni string ekler tam gibi yazdırır. kaydetmez.
        System.out.println(mesaj.concat(" Yaşasın !"));

        //başlangıca bakar true false döndürür büyük küçük harf duyarlılığı vardır.
        System.out.println(mesaj.startsWith("B"));
        //sona bakar true false döndürür
        System.out.println(mesaj.endsWith("."));

        //yeni bir diziye belirttiğimiz karakterleri belirttiğimiz şekilde atar
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        //string içinde arama yapar ilk bulduğunu çıktı olarak verir. Baştan başlar.
        System.out.println(mesaj.indexOf("a"));

        //baştan index numarası verir ama aramaya sondan başlar
        System.out.println(mesaj.lastIndexOf("a"));*/
        // isim değiştirmek için kullanılır
        String yeniMesaj=mesaj.replace( ' ','-');
        System.out.println(yeniMesaj);

        //belirttiğimiz indexten itibaren almaya başlar, 2. kısım da nereye kadar olduğunu belirtmek için kullanılır
        System.out.println(mesaj.substring(2,5));

        //belirrtiğimiz karaktere göre stringi parçalar
        for (String kelime : mesaj.split("")){
            System.out.println(kelime);
        }

        //mesajı küçük harfe çevirir
        System.out.println(mesaj.toLowerCase());
        //mesajı büyük harfe çevirir
        System.out.println(mesaj.toUpperCase());

        // stringin başındaki ve sonundaki boşlukları siler.
        System.out.println(mesaj.trim());








    }
}
