import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private List<List<Integer>> expected;
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
        expected = new ArrayList<>();
    }

    @Test
    public void minimumAbsDifferenceAllPositives() {
        Integer[][] expectedArray = new Integer[][]{{1, 2}, {2, 3}, {3, 4}};
        for (Integer[] subArray:expectedArray) {
            expected.add(Arrays.asList(subArray));
        }
        int[] inputArray = new int[]{4, 2, 1, 3};
        assertEquals(expected, solution.minimumAbsDifference(inputArray));
    }

    @Test
    public void minimumAbsDifferenceOneResult() {
        Integer[][] expectedArray = new Integer[][]{{1, 3}};
        for (Integer[] subArray:expectedArray) {
            expected.add(Arrays.asList(subArray));
        }
        int[] inputArray = new int[]{1,3,6,10,15};
        assertEquals(expected, solution.minimumAbsDifference(inputArray));
    }

    @Test
    public void minimumAbsDifferenceNegativeAndPositiveValues() {
        Integer[][] expectedArray = new Integer[][]{{-14,-10},{19,23},{23,27}};
        for (Integer[] subArray:expectedArray) {
            expected.add(Arrays.asList(subArray));
        }
        int[] inputArray = new int[]{3,8,-10,23,19,-4,-14,27};
        assertEquals(expected, solution.minimumAbsDifference(inputArray));
    }
}