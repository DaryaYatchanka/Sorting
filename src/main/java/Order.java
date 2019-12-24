import java.util.Comparator;



public class Order implements Comparable<Order>{
    String item;
    String orderId;
    String shippedFrom;

    public Order(String item, String orderId, String shippedFrom){
        this.item =item;
        this.orderId= orderId;
        this.shippedFrom = shippedFrom;
    }


    public String getItem() {
        return item;
    }

    public void setName(String item) {
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShippedFrom() {
        return shippedFrom;
    }

    public void setShippedFrom(String shippedFrom) {
        this.shippedFrom = shippedFrom;
    }


    @Override
    public int compareTo(Order o) {
        return Comparator.comparing(Order::getItem)
                .thenComparing(Order::getOrderId)
                .thenComparing(Order::getShippedFrom)
                .compare(this, o);
    }



    public String formatString() {
        return item + " " +
                   orderId + " " +
                shippedFrom + " ";
    }


}
