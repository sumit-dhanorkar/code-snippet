package collection;

public class HashMapHashExample {
    public static void main(String[] args) {
        Object key1 = 1;
        Object key2 = 2;

        int hash1 = hash(key1);
        int hash2 = hash(key2);

        System.out.println("Hash for key1: " + hash1);
        System.out.println("Hash for key2: " + hash2);

        Object obj1="abc";
        Object obj2=new String("abc");
        System.out.println(obj1 == obj2);

        int i = obj1.hashCode();
        System.out.println(i);
        int j = obj2.hashCode();
        System.out.println(j);
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
