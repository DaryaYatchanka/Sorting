import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>();
        Order a = new Order("Phone", "123", "Tokyo");
        Order b = new Order("Dress", "198", "New York");
        Order c = new Order("Laptop", "245", "San Francisco");
        Order d = new Order("Suit", "067", "Philadelphia");

        orders.add(a);
        orders.add(b);
        orders.add(c);
        orders.add(d);

        ArrayList<Order> modifiedOrders = new ArrayList<>();


        for(Order r: orders){
            if(r.getOrderId().charAt(0)!='0'){
                modifiedOrders.add(r);
            }
        }

        Collections.sort(modifiedOrders, Order.comp);


        for(Order o: modifiedOrders) {
            System.out.println(o.formatString());
         }
        }

    }

