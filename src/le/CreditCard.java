package le;

/**
 *
 * @author Phuc Hong Le
 */
public class CreditCard {

    //fields
    //change the capacity will change how the hashcode work
    private static int capacity = 1000000000; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreditCardC card = new CreditCardC(1656464984683438L, "Home Simpson");
        System.out.println(hash(card.hashCode()));
    }

    private static int hash(int hashCode) {
        return supplementalHash(hashCode) & (capacity - 1);
    }
    
    private static int supplementalHash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

}
