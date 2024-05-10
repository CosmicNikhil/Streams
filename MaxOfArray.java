package Streams;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {30,20,10};
        int max = Arrays.stream(arr).max().getAsInt();
        //optionalInt
        System.out.println(max);
    }
}
