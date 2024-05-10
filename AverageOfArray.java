package Streams;

import java.util.Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{30,20,10};
        //optionalDouble
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}
