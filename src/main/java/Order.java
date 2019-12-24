import java.util.Comparator;

public class Order {
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

    public static Comparator<Order> comp = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            String itemName1 = o1.getItem();
            String itemName2 = o2.getItem();

            return itemName1.compareTo(itemName2);
        }};





    public String formatString() {
        return item + " " +
                   orderId + " " +
                shippedFrom + " ";
    }
}
