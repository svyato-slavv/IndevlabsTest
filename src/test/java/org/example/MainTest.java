package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void findLostNumberInSortedArrayWithOneLostElement() { // testing sorted array with one lost element
        int[] array = new int[]{7, 9, 10, 11, 12};
        int actual = Main.findLost(array);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findLostNumberInNotSortedArrayWithOneLostElement() { // testing not sorted array with one lost element
        int[] array = new int[]{5, 0, 1, 3, 2, 4, 7};
        int actual = Main.findLost(array);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void findLostNumberInSortedArrayWithTwoLostElements() { // testing sorted array with two lost elements
        int[] array = new int[]{1, 2, 4, 5, 6, 7, 9};
        int actual = Main.findLost(array);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void findLostNumberInNotSortedArrayWithTwoLostElements() { // testing not sorted array with two lost elements
        int[] array = new int[]{5, 0, 1, 3, 2, 6, 8};
        int actual = Main.findLost(array);
        int expected = 4;
        assertEquals(expected, actual);
    }


    @Test
    void findLostNumberInSortedArrayWithTwoMissingElementsInRow() {  // testing sorted array with two lost elements in a row.
        int[] array = new int[]{0, 1, 2, 3, 6, 7, 8};
        int actual = Main.findLost(array);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findLostNumberInNotSortedArrayWithTwoMissingElementsInRow() {  // testing not sorted array with two lost elements in a row.
        int[] array = new int[]{5, 0, 1, 3, 2, 8, 4};
        int actual = Main.findLost(array);
        int expected = 6;
        assertEquals(expected, actual);
    }


    @Test
    void findLostNumberInSortedArrayWithoutLostElements() { // testing sorted array without lost elements
        int[] array = new int[]{4, 5, 6, 7, 8, 9};
        int actual = Main.findLost(array);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void findLostNumberInNotSortedArrayWithoutLostElements() {  // testing not sorted array without lost elements.
        int[] array = new int[]{5, 0, 1, 3, 2, 6, 8, 4, 7};
        int actual = Main.findLost(array);
        int expected = -1;
        assertEquals(expected, actual);
    }


    @Test
    void findLostNumberInArrayWithOneElement() {  // testing array with only one element.
        int[] array = new int[]{2};
        int actual = Main.findLost(array);
        int expected = -1;
        assertEquals(expected, actual);
    }


    @Test
    void findLostNumberWhenArrayContainsNegativeNumber() {  // testing array with negative number. Should throw RuntimeException.
        int[] array = new int[]{0, 1, -2, 3, 4};
        assertThrows(RuntimeException.class, () -> Main.findLost(array), "All array elements must be greater than 0!");
    }


    @Test
    void findLostNumberInEmptyArray() {  // testing an empty array. Should throw RuntimeException.
        int[] array = new int[0];
        assertThrows(RuntimeException.class, () -> Main.findLost(array), "Array is empty!");
    }

    @Test
    void findLostNumberWhenArrayIsNull() {  // testing null array. Should throw RuntimeException.
        int[] array = null;
        assertThrows(RuntimeException.class, () -> Main.findLost(array), "Array is null!");
    }

}