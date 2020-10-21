import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler =new ArrayList<String>();
        sehirler.add("Gaziantep");
        sehirler.add("Kilis");
        sehirler.add("Ankara");
        sehirler.add("İstanbul");

        sehirler.remove("İstanbul");

        //sıralama yapar
        Collections.sort(sehirler);

        //stringe göre gezer 
        for (String sehir: sehirler){
            System.out.println(sehir);
        }
    }
}
