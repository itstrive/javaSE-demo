import java.util.*;

public class ArrayDemo4{
    public static void main(String args[]){
        int arr[] = {90, 101, 5, 6, 7, 8, 9};

        printArray(arr);

        System.out.println("Max Value:" + getMax(arr));
        System.out.println("Min Value:" + getMin(arr));
        System.out.println("Sum Value:" + getSum(arr));
        System.out.println("avg Value:" + getAvg(arr));
    }

    public static double getAvg(int arr[]) {
        return getSum(arr) / arr.length;
        //return ArrayDemo3.getSum(arr) / arr.length;
    }

    public static int getSum(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int getMin(int arr[]) {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i=1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}