public class Main {

    public static void main(String[] args) {
        //double[] myList=new double[4];

        double[] myList = {1.2, 1.3, 7.6, 5.6};
        double total = 0;
        double enBuyuk = myList[0];
        for (double number : myList) {
            if (enBuyuk < number) {
                enBuyuk = number;
            }
            total = total + number;
            System.out.println(number);


        }
        System.out.println("Toplam=" + total);
        System.out.println("En büyük=" + enBuyuk);

    }
}
