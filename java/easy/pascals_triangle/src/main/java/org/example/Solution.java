package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            if (row == 0) {
                triangle.add(List.of(1));
            } else if (row == 1) {
                triangle.add(List.of(1, 1));
            } else {
                List<Integer> rowList = new ArrayList<>();
                for (int index = 0; index <= row; index++) {
                    if (index == 0 || index == row) {
                        rowList.add(1);
                    } else {
                        Integer sumTwoPriorNumbers = triangle.get(row - 1).get(index - 1) +
                                triangle.get(row - 1).get(index);
                        rowList.add(sumTwoPriorNumbers);
                    }
                }
                triangle.add(rowList);
            }
        }
        return triangle;
    }
}
