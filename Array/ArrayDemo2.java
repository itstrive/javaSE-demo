import java.util.*;

/**
 * 数组拷贝
 * System.arraycopy(原数组名称，原数组起始点，目标数据名称，目标数组起始点，拷贝长度)
  */

public class ArrayDemo2{
    public static void main(String args[]){
        int arrA[] = {1,2,3,4,5,6,7,8};
        int arrB[] = {11,22,33,44,55,66,77,88};
        
        System.arraycopy(arrB,1,arrA,1,2);

        printArray(arrA); //1,22,33,4,5,6,7,8
    }

    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}