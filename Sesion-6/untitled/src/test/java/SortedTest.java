import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedTest {

    @Test
    public void SortedArray(){
        Sorted.sort(new int[]{});

    }

    @Test
    public void EmptyArray(){
        int[] arr = new int[] {};
        assertArrayEquals(new int[]{}, Sorted.sort(arr));

    }
    @Test
    public void oneElement(){
        int[] arr = new int[] {1};
        assertArrayEquals(new int[]{1}, Sorted.sort(arr));
    }

    @Test
    public void twoElements(){
        int[] arr = new int[] {1,2};
        assertArrayEquals(new int[]{1,2}, Sorted.sort(arr));
    }

    @Test
    public void twoElements2(){
        int[] arr = new int[] {2,1};
        assertArrayEquals(new int[]{1,2}, Sorted.sort(arr));
    }

    @Test
    public void twoElements3(){
        int[] arr = new int[] {2,2};
        assertArrayEquals(new int[]{2,2}, Sorted.sort(arr));
    }

    @Test
    public void threeElements(){
        int[] arr = new int[] {1,2,3};
        assertArrayEquals(new int[]{1,2,3}, Sorted.sort(arr));
    }

    @Test
    public void threeElements2(){
        int[] arr = new int[] {1,3,2};
        assertArrayEquals(new int[]{1,2,3}, Sorted.sort(arr));
    }


    @Test
    public void threeElements3(){
        int[] arr = new int[] {2,3,1};
        assertArrayEquals(new int[]{1,2,3}, Sorted.sort(arr));
    }



    @Test
    public void threeElements5(){
        int[] arr = new int[] {3,2,1,4};
        assertArrayEquals(new int[]{1,2,3,4}, Sorted.sort(arr));
    }


    @Test
    public void threeElements7(){
        int[] arr = new int[] {2,1,3};
        assertArrayEquals(new int[]{1,2,3}, Sorted.sort(arr));
    }

    @Test
    public void threeElement8(){
        int[] arr = new int[] {1,1,1};
        assertArrayEquals(new int[]{1,1,1}, Sorted.sort(arr));
    }

    @Test
    public void tenElements7(){
       // Assert.assertFalse(list.isEmpty());
       // Assertions.assertFalse(list.isEmpty());
        int[] arr = new int[] {2,1,3,4,7,9,8,5,10,6};
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, Sorted.sort(arr));
    }



}