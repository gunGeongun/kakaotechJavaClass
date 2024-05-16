package org.example.course2.part1;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr={5,3,9,1,7};
        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);

        System.out.println("Minimum value:"+ min);
        System.out.println("Maximum value:"+ max);
    }
}
