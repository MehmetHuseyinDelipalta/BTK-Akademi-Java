public class ProductValidator {

    static {
        System.out.println("Statik Yapıcı blok çalıştı");
    }





    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public void bisey(){

    }
    //bu yapıya inner class denir. Ana klasta statik olmaz ama bu şekilde kullanılabilir.
//    public static class BaskaBirClass{
//        public static void Sil(){
//
//        }
//    }
}
