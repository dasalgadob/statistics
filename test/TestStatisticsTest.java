package test.test;

import co.edu.unal.dasalgadob.statistics.Statistics;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStatisticsTest {
    private static   int[]  oddArray, evenArray ;
    @BeforeAll
    static void setup(){
        oddArray = new int[]{1, 2, 3, 4, 5};
        evenArray = new int[]{1,2,3,4,5,6};
    }


    @Test
    void testMedianEvenArray(){
        int [] arr = {1,2,3,4,5,6};
        double median = Statistics.median(arr);
        assertEquals(median, 3.5, 0.01 );
    }

    @Test
    void testMedianOddArray(){
        int [] arr = {1,2,3,4,5};
        double median = Statistics.median(arr);
        assertEquals(median, 3.0, 0.01 );
    }

    @Test
    void testRangeOfArray(){
        //int[]  oddArray, evenArray ;
        int rangeOdd = Statistics.range(oddArray);
        int rangeEven = Statistics.range(evenArray);
        assertEquals(4, rangeOdd, "Range for odd array should be equals to 4");
        assertEquals(5, rangeEven, "Range for even array should be equals to 5");

    }

}