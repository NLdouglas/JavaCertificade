package Duke.Choice;

public class ShopApp {

    public static void main(String [] args) {

        double total = 0.0;
        double tax = 0.2;
        System.out.println("Welcome to duke Choice Shop");
        Customer c1 = new Customer();
        c1.setName("Pink");
        c1.setSize("S");


        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();

        Clothing [] items = {item1, item2, item3, new Clothing()} ;
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");


        // Adicionando valor ao index da lista de objetos Clothing
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        int measurement = 8;
        c1.addItems(items);
        c1.setSize(measurement);

        for (Clothing itens: c1.getItems() ){
            System.out.println("Customer is " + c1.name + "," + c1.getSize() + "," + c1.getTotalClothingCost());

            }
        }
    }


