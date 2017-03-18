import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;


public class StackTest {


		@Test
		public void StackTest1() {
			
		     Stack <Integer> s1 = new Stack<Integer>();
		     Integer i = 1;   s1.push(i);
		     i = 2; s1.push(i);
		     Collection<Integer> result = new ArrayList<Integer> ();
		     s1.popAll(result);		     
		     Collection<Integer> ref = new ArrayList<Integer>();
		     ref.add(2);
		     ref.add(1);
			assertEquals(ref, result);
		}
		
		@Test
		public void StackTest2() {
			
		     Stack <String> s1 = new Stack<String>();
		     String i = "one";   s1.push(i);
		     i = "two"; s1.push(i);
		     Collection<String> result = new ArrayList<String> ();
		     s1.popAll(result);		     
		     Collection<String> ref = new ArrayList<String>();
		     ref.add("two");
		     ref.add("one");
			assertEquals(ref, result);
		}
		
		@Test
		public void StackTest3() {
			
		     Stack <Object> s1 = new Stack<Object>();
		     Object i = "one";   s1.push(i);
		     i = "two"; s1.push(i);
		     i = 1; s1.push(i);
		     Collection<Object> result = new ArrayList<Object> ();
		     s1.popAll(result);		     
		     Collection<Object> ref = new ArrayList<Object>();
		     ref.add("two");
		     ref.add("one");
			assertEquals(ref, result);
		}
}
