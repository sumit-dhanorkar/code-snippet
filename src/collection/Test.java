package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            FileInputStream file =new FileInputStream("C:\\Users\\HP\\Documents\\Learning\\CodeSnippest\\src\\collection\\sam.txt");
            Properties prop = new Properties();
            prop.load(file);
            System.out.println(prop.getProperty("name"));
            System.out.println(prop.getProperty("age"));
        }catch (Exception e) {
            System.out.println("exception "+e);
        }

    }
}
