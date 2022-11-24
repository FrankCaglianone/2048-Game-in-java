package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BugSpawnTest {

    // [[64, 16, 8, 0], [16, 0, 2, 0], [4, 0, 0, 0], [0, 0, 0, 0]]

    private static final int TIMES_TO_REPEAT = 1000;
    private Grid buggedGrid = new Grid();
    private Spawn spawn;

    @Before
    public void setUp() throws Exception {
        resetBuggedGrid();

        spawn = new Spawn(buggedGrid);
    }

    private void resetBuggedGrid() {
        buggedGrid.getGrid()[0][0] = 64;
        buggedGrid.getGrid()[0][1] = 16;
        buggedGrid.getGrid()[0][2] = 8;
        buggedGrid.getGrid()[1][0] = 16;

        buggedGrid.getGrid()[1][2] = 2;
        buggedGrid.getGrid()[2][0] = 4;
    }

    //    [[64, 16, 8, 0],
    //     [16, 0, 2, 0],
    //     [4, 0, 0, 0],
    //     [0, 0, 0, 0]]

    @Test
    public void testSpawn() {
        int[][] expectedGrid = expectedGrid();

        for (int i = 0; i < TIMES_TO_REPEAT; i++) {
            resetBuggedGrid();
            spawn.spawn();
            compareGridToExpected(expectedGrid);
        }
    }

    private void compareGridToExpected(int[][] expectedGrid) {
        for (int i = 0; i < expectedGrid.length; i++) {
            for (int j = 0; j < expectedGrid.length; j++) {
                int value = expectedGrid[i][j];
                if (value != 0) {
                    assertEquals(value, buggedGrid.getGrid()[i][j]);
                }
            }
        }
    }

    private int[][] expectedGrid() {
        int[][] expectedGrid = new int[4][4];
        expectedGrid[0][0] = 64;
        expectedGrid[0][1] = 16;
        expectedGrid[0][2] = 8;
        expectedGrid[1][0] = 16;

        expectedGrid[1][2] = 2;
        expectedGrid[2][0] = 4;
        return expectedGrid;
    }

}
