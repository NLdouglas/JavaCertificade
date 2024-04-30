package Duke.Choice;


public class testes {
    public void printWishList () {
        String[] list = {"lalal", "lala2"};
        
        for (String idea: list) {
            System.out.println(idea);
        }
    }

    public double getTotal (double price, int quantity) {
        double total = price*quantity;//tax;
        return total;
    }

}




