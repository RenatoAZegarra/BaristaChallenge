public class Test {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha", 3.99);
        Item item2 = new Item("latte", 4.49);
        Item item3 = new Item("drip coffee", 2.99);
        Item item4 = new Item("cappuccino", 4.99);

        // Order variables
        Order order1 = new Order(); // Unspecified guest
        Order order2 = new Order(); // Unspecified guest
        Order order3 = new Order("Alex"); // Named order
        Order order4 = new Order("Jimmy"); // Named order
        Order order5 = new Order("Noah"); // Named order

        // Adding items to orders using addItem method
        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item4);
        order3.addItem(item3);
        order3.addItem(item4);
        order4.addItem(item1);
        order4.addItem(item2);
        order5.addItem(item1);
        order5.addItem(item4);

        // Setting order statuses
        order2.setReady(true);
        order4.setReady(true);

        // Testing methods
        System.out.println(order2.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order3.display();
        order5.display();
    }
}