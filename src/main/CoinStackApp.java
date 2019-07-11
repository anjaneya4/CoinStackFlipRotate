package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinStackApp {

    /**
     * Find index of first mismatch and flip consecutive same face upwards.
     * This increases the number of coins having same face upwards in each iteration.
     *
     * @param coins
     * @return
     */
    public static int getNumFlipRotateOperations(Integer[] coins) {
        System.out.println(Arrays.toString(coins));
        int count = 0;
        int m = getMaxConsecutiveArrangedCoins(coins);
        while (m != coins.length) {
            coins = flipRotate(coins, m);
            System.out.println(Arrays.toString(coins));
            m = getMaxConsecutiveArrangedCoins(coins);
            count++;
        }
        return count;
    }

    private static int getMaxConsecutiveArrangedCoins(Integer[] coins) {
        int previous = coins[0];
        int index = 1;
        while (index < coins.length && previous == coins[index]) previous = coins[index++];
        System.out.println("m = " + index);
        return index;
    }

    /**
     * 1. Flips m coins starting from the START of the array
     * 2. Reverses the array- in effect inverting the stack
     *
     * @param coins
     * @param m
     * @return Returns the m-flipped rotated stack
     */
    private static Integer[] flipRotate(Integer[] coins, int m){
        List<Integer> coinList = Arrays.asList(coins);
        List<Integer> flipped = new ArrayList<>();
        for(int i = 0; i < m; i++){
            flipped.add(coinList.get(i) == 0 ? 1 : 0);
        }
        flipped.addAll(coinList.subList(m, coinList.size()));
        System.out.println("flipped: " + flipped);
        Collections.reverse(flipped);
        System.out.println("reversed: " + flipped);
        return flipped.toArray(new Integer[0]);
    }

}
