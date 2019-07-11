package main;

import org.junit.Assert;
import org.junit.Test;

public class CoinStackAppTest {

    @Test
    public void test_getNumFlipRotateOperations_4_coins(){
        Integer[] coins = new Integer[]{0,1,0,0};
        int expectedNumFlipRotateOperations = 2;
        Assert.assertEquals(expectedNumFlipRotateOperations, CoinStackApp.getNumFlipRotateOperations(coins));
    }

    @Test
    public void test_getNumFlipRotateOperations_3_coins(){
        Integer[] coins = new Integer[]{1, 1, 0};
        int expectedNumFlipRotateOperations = 1;
        Assert.assertEquals(expectedNumFlipRotateOperations, CoinStackApp.getNumFlipRotateOperations(coins));
    }

    @Test
    public void test_getNumFlipRotateOperations_10_coins(){
        Integer[] coins = new Integer[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        int expectedNumFlipRotateOperations = 9;
        Assert.assertEquals(expectedNumFlipRotateOperations, CoinStackApp.getNumFlipRotateOperations(coins));
    }

    @Test
    public void test_getNumFlipRotateOperations_11_coins(){
        Integer[] coins = new Integer[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int expectedNumFlipRotateOperations = 10;
        Assert.assertEquals(expectedNumFlipRotateOperations, CoinStackApp.getNumFlipRotateOperations(coins));
    }

    @Test
    public void test_getNumFlipRotateOperations_10_coins_alreadyArranged(){
        Integer[] coins = new Integer[]{0,0,0,0,0,0,0,0,0,0};
        int expectedNumFlipRotateOperations = 0;
        Assert.assertEquals(expectedNumFlipRotateOperations, CoinStackApp.getNumFlipRotateOperations(coins));
    }

}
