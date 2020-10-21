public class Main {

    public static void main(String[] args) {
	    //For
        for (int i=1;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti.");


        //While
        int i=1;
        while (i<10){

            System.out.println(i);
            i=i+1;
        }
        System.out.println("While Döngüsü bitti.");

        //Do-While Döngüsü  -- Şart uymasa bile döngü 1 defa olsa çalışır  -- Genelde Veritabanını loglamak için kullanılır
        int j=1;
        do {
            System.out.println(j);
            j=j+2;
        }while (j<10);
        System.out.println("Do - While Döngüsü bitti.");
    }
}
