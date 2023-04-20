import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

	@Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input1);
	}

  @Test
  public void testReverseInPlace1(){
    int[] input1 = { 0, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 0 }, input1);
  }

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 7, 6, 5, 4, 3, 2, 1 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //@Test
  //public void testReversed1() {
    //int[] input1 = { 1, 2, 3, 4, 5, 6, 7 };
    //assertArrayEquals(new int[]{ 7, 6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  //}

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
    assertArrayEquals(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 0, 1 };
    assertArrayEquals(new int[]{ 1, 0 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = { 1 };
    assertEquals(0.0 , ArrayExamples.averageWithoutLowest(input1), 0.00);
  }

  @Test
  public void testAverageWithoutLowest1(){
    double[] input1 = { 1 , 3 };
    assertEquals(1.5, ArrayExamples.averageWithoutLowest(input1), 0.00);
  }
  
  @Test
  public void testAverageWithoutLowest2(){
    double[] input1 = {3, 2, 6};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.00);
  }

  @Test
  public void testAverageWithoutLowest3(){
    double[] input1 = { };
    assertEquals(0.0 , ArrayExamples.averageWithoutLowest(input1), 0.00);
  }
  
  @Test
  public void testAverageWithoutLowest4(){
    double[] input1 = {4, 2, 2, 4};
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1), 0.00);
  }
}