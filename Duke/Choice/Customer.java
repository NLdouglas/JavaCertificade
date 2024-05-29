package Duke.Choice;

public class Customer {
    String name;
    String size = "S";
    private Clothing[] items ;

    public void addItems ( Clothing[] someItems){ // addItems recebe void pois n tem um tipo (double, int, String...) declarado,
        items = someItems;
    }
    public Clothing[] getItems(){
        return items;
    }

    public double getTotalClothingCost(){
        double total = 0.0;
        for (Clothing itens: items ){
            total += itens.getPrice();

            }
        return total;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("X");
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


 }
