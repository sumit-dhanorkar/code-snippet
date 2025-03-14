package dev;

import java.util.*;

public class Solution {
    public static List<Integer> isPower(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add((num > 0 && (num & (num - 1)) == 0) ? 1 : 0);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        
        List<Integer> output = isPower(arr);
        for (int val : output) {
            System.out.println(val);
        }
        
        scanner.close();
    }
}
