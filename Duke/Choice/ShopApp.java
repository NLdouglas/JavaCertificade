package Duke.Choice;

public class ShopApp {

    public static void main(String [] args) {

        double tax = 0.2;
        double total;
        int measurement = 3;

        System.out.println("Welcome to duke Choice Shop");

        Customer c1 = new Customer();
        c1.name = "Pink";
        c1.size = "S";
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        //other way do call size
        //item1.size = "M"
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

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


        System.out.println("Customer is " + c1.name);
        System.out.println("Clothing " + item1.description + ", price is " + item1.price + "and size is " + item1.size);
        System.out.println("Clothing " + item2.description + ", price is " + item2.price + "and size is " + item2.size);
        total = (item1.price + item2.price * 2) + (1 + tax);
        System.out.println(total);
    }

}
