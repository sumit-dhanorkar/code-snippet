class UserMainCode {

    public static void main(String[] args) {
//        int i = numberOfIdeas(4, 2);
//        System.out.println(i);
        try{

        }catch (Exception e){
//            throw  new Exception();
        }
    }
    public static int numberOfIdeas(int input1, int input2) {
        int total = 0;
        total += input1;
        for (int r = 2; r <= input2; r++) {
            total += (int) combination(input1, r);
        }
        return total;
    }
    
    private static long combination(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        r = Math.min(r, n - r);
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}