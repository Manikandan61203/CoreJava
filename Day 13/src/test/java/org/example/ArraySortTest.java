package org.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class ArraySortTest {
    @Test
    public void EmptyArray()
    {
        int[] array = {};
        int[] expected = {};
        ArraySort.SortArray(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void SortedArray()
    {
        int[] array = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};
        ArraySort.SortArray(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void ArrayWithDuplicates()
    {
        int[] array = {5,4,6,5,2};
        int[] expected = {2,4,5,5,6};
        ArraySort.SortArray(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void ArrayWithNegatives()
    {
        int[] array = {-3,2,4,0,-6};
        int[] expected = {-6,-3,0,2,4};
        ArraySort.SortArray(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void SingleValue()
    {
        int[] array = {56};
        int[] expected = {56};
        ArraySort.SortArray(array);
        assertArrayEquals(expected, array);
    }
}