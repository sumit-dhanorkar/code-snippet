import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][] items2 = {{3,1},{1,5}};

        Arrays.sort(items2, (a,b)->a[0]-b[0]);

        System.out.println(Arrays.deepToString(items2));


    }
}
