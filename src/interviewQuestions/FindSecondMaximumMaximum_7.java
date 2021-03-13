package interviewQuestions;

import java.util.Arrays;

public class FindSecondMaximumMaximum_7 {

    public int findSecondMax(int[]arr ){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr [j];
                    arr[j]= arr[i];
                    arr [i] = temp;

                }

            }
        }




        return arr[arr.length-2];
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int secondMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public int secondMin(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
}







