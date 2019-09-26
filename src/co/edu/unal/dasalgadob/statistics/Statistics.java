package co.edu.unal.dasalgadob.statistics;

import java.util.Arrays;

public class Statistics {
    /**
     * It calculates the median based on the definion of the middle value if the length of the array is odd,
     * or the average of the central values in case the length is even
     * @param arr array of elements to get median it does not need to be ordered
     * @return the median of the array
     */
    public static double median(int [] arr){
        Arrays.sort(arr);
        double median;
        //if it is even
        if(arr.length % 2==0){
            median = (double) (arr[arr.length/2 - 1] + arr[arr.length/2]) /2;
        }
        else{
            median = arr[arr.length/2];
        }
        return median;
    }

    /**
     * Calculates the average of the array making the sum of all the elements and dividing by the length of the array
     * @param array To be calculated the mean
     * @return mean of the array given
     */
    public static double mean(int[] array){
        return 0.0;
    }

    public static int range(int[] arr){
        Arrays.sort(arr);
        return -arr[0]+ arr[arr.length-1];
    }
}
