package genericMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapperTest {

    @Test
    void testStringSwap1And2OutOf5() throws IndexingError {

        String[] stringArray = {"Matthew", "Sam", "Potato", "Jack", "Luqmaan"};
        String[] expectedArray = {"Matthew", "Potato", "Sam", "Jack", "Luqmaan"};
        assertArrayEquals(expectedArray, Swapper.swap(stringArray,1,2));
    }

    @Test
    void testIntegerSwap1And5OutOf10() throws IndexingError {

        Integer[] expectedArray = {1,2,3,4,5,6,7,8,9,10};
        Integer[] intArray = {1,6,3,4,5,2,7,8,9,10};
        assertArrayEquals(expectedArray, Swapper.swap(intArray,1,5));
    }

    @Test
    void testIntegerSwap4And15OutOf20() throws IndexingError {

        Integer[] expectedArray = {1,2,3,4,16,6,7,8,9,10,11,12,13,14,15,5,17,18,19,20};
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        assertArrayEquals(expectedArray, Swapper.swap(intArray,4,15));
    }

}