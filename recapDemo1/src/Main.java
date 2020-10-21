public class Main {

    public static void main(String[] args)
    {
	int sayi1=31;
	int sayi2=25;
	int sayi3=32;

        if (sayi1>sayi2 && sayi1>sayi3)
        {
            System.out.println("Sayi 1 En büyüktür");
        }

        else if (sayi2>sayi1 && sayi2>sayi3)
            System.out.println("Sayi2 en büyüktür.");

        else
        {
            System.out.println("Sayi3 en büyüktür.");
        }



        //Ya da böyle yapılabilirdi

        int enBuyuk=sayi1;

        if (enBuyuk<sayi2)
        {
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3)
        {
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayı:"+enBuyuk);







    }
}
