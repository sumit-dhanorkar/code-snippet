package collection;

public class HashCollisionExample {
    public static void main(String[] args) {
        String key1 = "FB";
        String key2 = "Ea";

        System.out.println("key1: " + key1);
        System.out.println("key2: " + key2);
        
        // Checking hash codes
        System.out.println("Hash code of key1 (\"FB\"): " + key1.hashCode());
        System.out.println("Hash code of key2 (\"Ea\"): " + key2.hashCode());

        // Checking equality
        System.out.println("Are key1 and key2 equal? " + key1.equals(key2));

        /*
            output:
            key1: FB
            key2: Ea
            Hash code of key1 ("FB"): 2236
            Hash code of key2 ("Ea"): 2236
            Are key1 and key2 equal? false
         */
    }
}
