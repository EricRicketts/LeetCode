import java.util.*;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> minimumAbsDifferenceListOfPairs = new ArrayList<>();
        int lastIndex = arr.length - 1;
        int[] miniDiffArray = new int[]{(int)Integer.MAX_VALUE};

        for (int index = 0; index < lastIndex; index += 1) {
            int[] arraySlice = Arrays.copyOfRange(arr, index, lastIndex + 1);
            accumulateAbsDifferenceOfPairs(minimumAbsDifferenceListOfPairs, miniDiffArray, arraySlice);
        }

        sortListOfPairs(minimumAbsDifferenceListOfPairs);
        return minimumAbsDifferenceListOfPairs;
    }

    private void accumulateAbsDifferenceOfPairs(List<List<Integer>> pairs, int[] miniDiffArray, int[] arraySlice) {
        int firstValue = arraySlice[0];

        for (int index = 1; index < arraySlice.length; index += 1) {
            int secondValue = arraySlice[index];
            int difference = Math.abs(secondValue - firstValue);
            int currentMinDiff = miniDiffArray[0];
            if (difference < currentMinDiff) {
                miniDiffArray[0] = difference;
                pairs.clear();
                sortPairAndAddToList(pairs, firstValue, secondValue);
            } else if (difference == currentMinDiff) {
                sortPairAndAddToList(pairs, firstValue, secondValue);
            } else {
                continue;
            }
        }
    }

    private void sortListOfPairs(List<List<Integer>> pairs) {
        Comparator<List<Integer>> comp = (a, b) -> {
            return a.get(0).compareTo(b.get(0));
        };
        Collections.sort(pairs, comp);
    }

    private void sortPairAndAddToList(List<List<Integer>> pairs, int firstValue, int secondValue) {
        Integer[] pair;
        if (secondValue < firstValue) {
            pair = new Integer[]{secondValue, firstValue};
        } else {
            pair = new Integer[]{firstValue, secondValue};
        }
        pairs.add(Arrays.asList(pair));
    }

}
