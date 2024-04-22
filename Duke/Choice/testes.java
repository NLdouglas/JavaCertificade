package Duke.Choice;

public class testes {
<<<<<<< HEAD
    public static void main (String [] args ){


        int [] ages1 = new int [3];
        ages1[0] = 19;
        ages1[1] = 15;
        ages1[2] = 14;



        System.out.println(ages1);

        System.out.println("Test" + args[0]);




=======
    public static void main (String [] args ) {
>>>>>>> 93df78816dd58f15638ae8a7be8ed6a0402bcae8

        int passmark = 12;
        boolean passed = false;
        int [] scores = { 4, 6, 2, 8, 12, 35};
        for( int i : scores) {
            if (i >= 12) {
                passed = true;
                break;
            }
        }
        System.out.println("At least one passed? " +passed);

    }

}

