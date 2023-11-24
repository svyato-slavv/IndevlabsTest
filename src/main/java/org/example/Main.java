package org.example;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        int[] nullArray = null;
//        int[] emptyArray = new int[0];
//        int[] arrayWithNegative = new int[]{9, 5, 12, 7, 4, 10, 8, 11, 13, 3, 14, 15, 16, 18, -6};
        int[] testArray = new int[]{4, 9, 8, 10, 11, 12, 14, 5, 6};
        int lostNumber = findLost(testArray);  //Calling our function
        if (lostNumber == -1) {
            System.out.println("All elements of the array are in place");
        } else
            System.out.println(lostNumber);
    }

    public static int findLost(int[] array) {  //Function finds a first missing number. N elements can be skipped. N elements in a row can be skipped.
        if (array == null) {  //if array is null -> throw Exception.
            throw new RuntimeException("Array is null!");
        }
        if (array.length == 0) {  //if array is empty -> throw Exception.
            throw new RuntimeException("Array is empty!");
        }
        Arrays.sort(array);  //sorting array
        int number = -1;  //assign the value -1, if it is saved, then there is no missing element in the array
        for (int i = 0; i < array.length; i++) {  //open the loop
            int nextValue = array[i];
            if (nextValue < 0) {  //if there is a negative number in the array -> throw Exception.
                throw new RuntimeException("All array elements must be greater than 0!");
            }
            if (nextValue != i + array[0]) {  //if current element is not equal to (its index + the value of the first element),
                int countOfSkips = nextValue - array[0] - i;  //so there was a skip(s), counting the number of missing elements
                number = nextValue - countOfSkips;  //value of the missing element is (value of current element-count of skips).
                break;  //we exit the loop, the following iterations are meaningless.
            }
        }
        return number;   //return the missing number or (-1)
    }
}