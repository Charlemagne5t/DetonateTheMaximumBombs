package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maximumDetonation(int[][] bombs) {

        int max = 1;
        for (int i = 0; i < bombs.length; i++) {
            max = Math.max(max, detonate(bombs, bombs[i], i));
        }
        return max;
    }

    private int detonate(int[][] bombs, int[] bomb, int bombIndex){
        int count = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(bomb);
        boolean[] detonated = new boolean[bombs.length];
        while (!queue.isEmpty()){
            int[] currentBomb = queue.poll();
            detonated[bombIndex] = true;
            int x = currentBomb[0];
            int y = currentBomb[1];
            long radius = currentBomb[2];

            for (int i = 0; i < bombs.length; i++) {
                if (detonated[i]) continue;
                if (radius * radius >= (long) (x - bombs[i][0]) * (x - bombs[i][0]) + (long)(y - bombs[i][1]) * (y - bombs[i][1]) ) {
                    queue.add(bombs[i]);
                    detonated[i] = true;
                    count++;
                }
            }
        }
        return count;
    }

}
