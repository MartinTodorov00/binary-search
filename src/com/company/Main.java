package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7,8};

        System.out.println("Напишете числото на което искате да разберете индекса.");
        int x = Integer.parseInt(scanner.nextLine());

        int indexOfElement = binarySearch(array,x, 0, array.length - 1);
        if (indexOfElement < 0) {
            System.out.println("This element not exit in array");
        }else {
            System.out.println("Element is present at index: " + indexOfElement);
        }

    }

    public static int binarySearch(int[] arr, int findElement, int firstIndex, int lastIndex) {

        int leftIndex = firstIndex;
        int rightIndex = lastIndex;

        if(leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if(arr[midIndex] == findElement) {
                return midIndex;
            }

            if(arr[midIndex] > findElement) {
                int newRightIndex = midIndex - 1;

                return binarySearch(arr, findElement, leftIndex, newRightIndex) ;
            }
            else {
                int newLeftIndex = midIndex + 1;
                return binarySearch(arr, findElement, newLeftIndex, rightIndex);
            }
        }

        return -1;
    }

}
