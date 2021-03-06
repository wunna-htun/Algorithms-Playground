package leetcode.interview_amazon_2.problem_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2Test {

    private final Solution_2 solution = new Solution_2();

    @Test
    public void maxProfit_1() throws Exception {
        final int[] prices = {7, 1, 5, 3, 6, 4};

        final int result = solution.maxProfit(prices);

        assertEquals(5, result);
    }

    @Test
    public void maxProfit_2() throws Exception {
        final int[] prices = {7, 6, 4, 3, 1};

        final int result = solution.maxProfit(prices);

        assertEquals(0, result);
    }
}