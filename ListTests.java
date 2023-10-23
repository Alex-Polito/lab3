import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testMerge() {
    List<String> input1 = new ArrayList<>();
    input1.add("a");
    input1.add("b");
    List<String> input2 = new ArrayList<>();
    input1.add("c");
    input1.add("d");
    List<String> result = new ArrayList<>();
    result.add("a");
    result.add("b");
    result.add("c");
    result.add("d");
    for(int i = 0; i < 4; i++){
    assertEquals(result.get(i), ListExamples.merge(input1, input2).get(i));
    }
	}
}
