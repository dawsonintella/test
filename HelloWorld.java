import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;


public class HelloWorld {
	
   String a = "a:Hello World";	
   String b = "b:Hello World";
   String c = "c:hello world";

   @Test
   public void test_ab() {
      assertEquals(a,b);
   }
   
   @Test
   public void test_ac() {
	      assertEquals(a,c);
   }
   
}