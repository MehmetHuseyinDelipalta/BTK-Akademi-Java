import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());
        //Hangi elemanda ne olduğunu görmeye yarar
        //System.out.println(sayilar.get(0));
        //Set komutu ile değiştirmeye yarar
        //sayilar.set(0,100);
        //System.out.println(sayilar.get(0));
        //Belirtilen indexteki sayıları siler
        //sayilar.remove(0);
        //sayilar.set(0,100);
        //sayilar.clear();
        //System.out.println(sayilar.get(1));

        for (Object i:sayilar){
            System.out.println(i);
        }







    }
}
