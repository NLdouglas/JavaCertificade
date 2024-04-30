package Duke.Choice;

public class ShopApp {

    public static void main(String [] args) {

        double tax = 0.2;
        double total = 0.0;
        int measurement = 3;

        System.out.println("Welcome to duke Choice Shop");

        Customer c1 = new Customer();
        c1.name = "Pink";
        c1.size = "S";

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();

        Clothing [] items = {item1, item2, item3, new Clothing()} ;
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Green scarf";
        item3.price = 5;
        item3.size = "S";

        // Adicionando valor ao index da lista de objetos Clothing
        items[3].description = "Green Scarf";
        items[3].price = 10.5;
        items[3].size = "S";

        System.out.println("Customer is " + c1.name);
//        for (Clothing itens: items){
//            System. out.println("Clothing " + itens.description + ", price is " + itens.price + ", and the size is " + itens.size);
//
//        }

        for (Clothing itens: items ){
            if (c1.size.equals(itens.size)) {
                total += itens.price;
                System.out.println("Clothing " + itens.description + ", price is " + itens.price + ", and the size is " + itens.size);
                if (total > 15){ break;}

            }

        }

        System.out.println(total);

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }





//        total = (item1.price + item2.price * 2) + (1 + tax);

    }

}
