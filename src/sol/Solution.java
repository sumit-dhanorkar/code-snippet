package sol;

import java.util.*;

    public class Solution {

        public static int getMinSteps(List<Integer> current, List<Integer> desired) {
            int n = current.size();

            // Step 1: Map elements in `current` to their indices
            Map<Integer, Integer> indexMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                indexMap.put(current.get(i), i);
            }

            // Step 2: Convert `desired` list to index order
            int[] transformed = new int[n];
            for (int i = 0; i < n; i++) {
                transformed[i] = indexMap.get(desired.get(i));
            }

            // Step 3: Find the length of the LIS in `transformed`
            int lisLength = findLIS(transformed);

            // Step 4: Compute the minimum steps required
            return n - lisLength;
        }

        private static int findLIS(int[] arr) {
            List<Integer> lis = new ArrayList<>();
            for (int num : arr) {
                int idx = Collections.binarySearch(lis, num);
                if (idx < 0) {
                    idx = -(idx + 1);
                }
                if (idx == lis.size()) {
                    lis.add(num);
                } else {
                    lis.set(idx, num);
                }
            }
            return lis.size();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input
            int n = scanner.nextInt();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                current.add(scanner.nextInt());
            }

            int m = scanner.nextInt();
            List<Integer> desired = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                desired.add(scanner.nextInt());
            }

            // Compute and print the result
            int result = getMinSteps(current, desired);
            System.out.println(result);

            scanner.close();
        }
    }


