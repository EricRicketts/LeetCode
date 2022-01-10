import java.util.*;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        return accumulatedMinDiffPairs(arr);
    }

    private List<List<Integer>> accumulatedMinDiffPairs(int[] arr) {
        int minDifference = Integer.MAX_VALUE;
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i += 1) {
            Integer[] pair = new Integer[]{arr[i], arr[i+1]};
            int difference = arr[i+1] - arr[i];
            if (difference < minDifference) {
                minDifference = difference;
                pairs.clear();
                pairs.add(Arrays.asList(pair));
            } else if (difference == minDifference) {
                pairs.add(Arrays.asList(pair));
            } else {
                continue;
            }
        }
        return pairs;
    }
}
