public class Main {

    public static void main(String[] args) {
	    String ogrenci1="Engin";
        String ogrenci2="mhd";
        String ogrenci3="delipalta";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("----------------------mhd------------------------");

        String[] ogrenciler=new String[3];
        ogrenciler[0]="Engin";
        ogrenciler[1]="mhd";
        ogrenciler[2]="delipalta";

        for (int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------------mhd----------------------");
        //üstteki for ile aynı yapıya sahiptir daha çok bu kullanılır
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }



    }
}
