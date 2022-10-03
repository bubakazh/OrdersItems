import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items

        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 1.2);
        Item item4 = new Item("cappuccino", 4.4);

//        item1.name = "mocha";
//        item2.name = "latte";
//        item3.name = "drip coffee";
//        item4.name = "cappuccino";
//
//        item1.price = 4.5;
//        item2.price = 3.5;
//        item3.price = 1.2;
//        item4.price = 4.4;

        // Order variables -- order1, order2 etc.

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


//        order1.name = "Cindhuri";
//        order2.name = "Jimmy";
//        order3.name = "Noah";
//        order4.name = "Sam";

        // Application Simulations

//        System.out.println(order1);
//        // I THINK THAT I WILL GET A null RETURNED IF I PRINT order1.total
//        System.out.format("$%.2f\n", order1.total);
//        // I DID NOT GET NULL, BUT 0.0, FORMATTED TO TWO DECIMAL PLACES.
//        order2.items.add(item1);
//        order2.total += item1.price;
//        order3.items.add(item4);
//        order3.total += item4.price;
//        order4.items.add(item2);
//        order4.total += item2.price;
//        order1.ready = true;
//        order4.items.add(item2);
//        order4.items.add(item2);
//        order4.total += item2.price * 2;
//        order2.ready = true;
//
//        // Use this example code to test various orders' updates
//        System.out.printf("Name: %s\n", order1.name);
//        System.out.printf("Total: %s\n", order1.total);
//        System.out.printf("Ready: %s\n", order1.ready);
//
//        System.out.printf("Name: %s\n", order2.name);
//        System.out.printf("Total: %s\n", order2.total);
//        System.out.printf("Ready: %s\n", order2.ready);
//
//        System.out.printf("Name: %s\n", order3.name);
//        System.out.printf("Total: %s\n", order3.total);
//        System.out.printf("Ready: %s\n", order3.ready);
//
//        System.out.printf("Name: %s\n", order4.name);
//        System.out.printf("Total: %s\n", order4.total);
//        System.out.printf("Ready: %s\n", order4.ready);
    }
}
