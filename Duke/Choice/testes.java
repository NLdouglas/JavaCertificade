package Duke.Choice;

public class testes {
    public static void main (String [] args ){
        double price = 1.99;
        double discount = 0;
        String condition = "Used";

        switch (condition) {
            case "Damage":
                price = price*0.1;
                break;
            case "Used":
                price = price*0.2;
                break;
            default:
                price = price;
        }

        System.out.println(price);

        // learning about if/else, ternary and switch case   
    }
}
