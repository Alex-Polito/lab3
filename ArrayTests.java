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
	public void testReverseInPlaceArrayLength2() {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test 
	public void testReversedArrayLength2() {
    int[] input1 = { 3, 4 };
    assertArrayEquals(new int[]{ 4, 3 }, ArrayExamples.reversed(input1));
	}
  @Test 
	public void testSum() {
    double[] input1 = { 1, 2, 2 };
    double result = 2;
    assertEquals(result, ArrayExamples.averageWithoutLowest(input1), .0001);
	}
}
