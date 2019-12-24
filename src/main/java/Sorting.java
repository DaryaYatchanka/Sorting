import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>();
        Order a = new Order("Phone", "123", "Tokyo");
        Order b = new Order("Dress", "200", "New York");
        Order c = new Order("Laptop", "245", "San Francisco");
        Order d = new Order("Suit", "067", "Philadelphia");
        Order e = new Order("Dress", "100", "Minsk");
        Order f = new Order("Dress", "200", "Alaska");

        orders.add(a);
        orders.add(b);
        orders.add(c);
        orders.add(d);
        orders.add(e);
        orders.add(f);

        ArrayList<Order> modifiedOrders = new ArrayList<>();


        for(Order r: orders){
            if(r.getOrderId().charAt(0)!='0'){
                modifiedOrders.add(r);
            }
        }

        Collections.sort(modifiedOrders);


        for(Order o: modifiedOrders) {
            System.out.println(o.formatString());
         }
        }

    }

