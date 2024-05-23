package Duke.Choice;

public class ShopApp {

    public static void main(String [] args) {

        double total = 0.0;
        double tax = 0.2;
        System.out.println("Welcome to duke Choice Shop");
        Customer c1 = new Customer();
        c1.setName("Pink");
        c1.setSize("S");
        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();

        Clothing [] items = {item1, item2, item3, new Clothing()} ;
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Blue Jacket");
        item2.setPrice(10.5);
        item2.setSize("S");


        // Adicionando valor ao index da lista de objetos Clothing
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        int measurement = 3;

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
                break;
        }

        for (Clothing itens: items ){
            if (c1.getSize().equals(itens.getSize())) {
                total += itens.getPrice();
                System.out.println("Clothing " + itens.getDescription() + ", price is " + itens.getPrice() + ", and the size is " + itens.getSize());
                total = total + total * tax;
                if (total > 15){ break;}

            }

        }
        System.out.println("Total = " + total);

    }

}
