package collection;

import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {

        int hash = hashCode(1, "sumit");
        System.out.println(hash);

        int hash1 = hashCode(1, "sumit");
        System.out.println(hash1);

        int a = hash % 3;
        System.out.println(a);
        System.out.println((3-1) & hash);


//        System.out.println(1<<30);
    }
    public static int hashCode(Object key, Object value) {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

}
