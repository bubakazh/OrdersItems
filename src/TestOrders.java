import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 1.2);
        Item item4 = new Item("cappuccino", 4.4);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Cherry");
        Order order4 = new Order("Angelica");
        Order order5 = new Order("Hannah");

        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item1);
        order2.addItem(item3);
        order3.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item2);
        order5.addItem(item4);

        order1.setReady(true);
        order3.setReady(true);
        order5.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        System.out.printf("$%.2f\n", order4.getOrderTotal());
        System.out.printf("$%.2f\n", order5.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
