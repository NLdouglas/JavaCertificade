package Duke.Choice;

public class testes {
    public static void main (String [] args ) {

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

