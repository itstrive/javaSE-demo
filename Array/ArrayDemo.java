import java.util.*;

public class ArrayDemo{
    public static void main(String args[]){
        int arr[]=new int[]{34,60,101,90,9};
        String arr2[]={"banana","pear","zero","apple"};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        printArray(arr);
        printArray(arr2);
    }

    /* 函数重载 */
    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +",");
        }
        System.out.println();
    }
}