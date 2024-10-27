package collection;

import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {

        int hash = hashCode(1, "sumit");
        System.out.println(hash);

        int hash1 = hashCode(1, "sumit");
        System.out.println(hash1);


//        System.out.println(2<<2);
    }
    public static int hashCode(Object key, Object value) {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

}
