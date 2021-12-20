import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private List<List<Integer>> expected;
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void minimumAbsDifference() {
        Integer[][] expectedArray = new Integer[][]{{1, 2}, {2, 3}, {3, 4}};
        for (Integer[] subArray:expectedArray) {
            expected.add(Arrays.asList(subArray));
        }
        int[] inputArray = new int[]{4, 2, 1, 3};
        assertEquals(expected, solution.minimumAbsDifference(inputArray));
    }
}