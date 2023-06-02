import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximumDetonationTest1() {
        int[][] bombs = {
                {2, 1, 3},
                {6, 1, 4}
        };
        int output = 2;
        Assert.assertEquals(output, new Solution().maximumDetonation(bombs));
    }

    @Test
    public void maximumDetonationTest2() {
        int[][] bombs = {
                {1, 1, 5},
                {10, 10, 5}
        };
        int output = 1;
        Assert.assertEquals(output, new Solution().maximumDetonation(bombs));
    }

    @Test
    public void maximumDetonationTest3() {
        int[][] bombs = {
                {1, 2, 3},
                {2, 3, 1},
                {3, 4, 2},
                {4, 5, 3},
                {5, 6, 4}
        };
        int output = 5;
        Assert.assertEquals(output, new Solution().maximumDetonation(bombs));
    }
    @Test
    public void maximumDetonationTest4() {
        int[][] bombs = {
                {1, 1, 100_000},
                {100_000, 100_000, 1},

        };
        int output = 1;
        Assert.assertEquals(output, new Solution().maximumDetonation(bombs));
    }

}
