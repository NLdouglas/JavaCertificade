package Duke.Choice;

public class testes {
    public static void main (String [] args ){

        int measurement = 2;


        Customer c1 = new Customer();
        c1.name = "Pink";
        c1.size = "S";

        switch (measurement) {
            case 1:
                c1.size = "S";
                break;
            case 2:
                c1.size = "M";
                break;
            case 3:
                c1.size = "S";
                break;

        }

        System.out.println(c1.size);

        // learning about if/else, ternary and switch case   
    }
}
