import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<Customer>();
        Customer mhd=new Customer(1,"mh","d");
        customers.add(mhd);
        customers.add(new Customer(2,"em","a"));
        customers.add(new Customer(3,"b","s"));

        customers.remove(mhd);

        for (Customer customer: customers){

            System.out.println(customer.firstName);
        }

        System.out.println();

    }
}
