package CIT360.DemoJunit;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
//  Added hamcrest-core  to use  (is and not) shortened code. It's a library of methods for substitute words. 
public class TestMyJunit {
	
	//You need all nine of the different asserts - Don't forget

	JunitTesting test = new JunitTesting();
	
	//assertEquals
	@Test
	public void testDiscPrice() {                         //testing to see if the calc gets the correct answer
		assertEquals(50,test.DiscPrice(100,50));	
		
	}
		
	//assertFalse and assertTrue
	@Test
	public void testEvenNumber(){
		int testValue1 = 3;
		assertFalse(test.isEvenNumber(testValue1));       // 3 is odd, so False
		int testValue2 = 4;
		assertTrue(test.isEvenNumber(testValue2));		  // 4 is even, so True
	}
	
	//assertNotNull and assertNull
    @Test
    public void testGetNullValue(){
        String testValue1 = "key1";
        assertNotNull(test.getValue(testValue1));         //Making sure it isn't Null
        String testValue2 = "key1";
      //  assertNull(test.getValue(testValue2));         //This will fail because there it isn't null.
    }

    //assertSame and assertNotSame
    @Test
    public void testGetSameValue(){
        String testValue1 = "key1";    
        String testValue2 = "key2";  
        assertSame(test.getValue(testValue1), test.getValue(testValue1));  //Compare like things - are the same
        assertNotSame(test.getValue(testValue1), test.getValue(testValue2)); //Compare not like things - not same
    }    
    
    //assertArrayEquals and "Not" get around
    @Test
    public void testGetTheStringArray() {
        String[] expectedArray = {"one", "two", "three"};   //Compare two arrays that are identical
        String[] resultArray =  test.stringArray();         //Use assertArrayEquals to see if they are identical.
        assertArrayEquals(expectedArray, resultArray);
        String[] primaryArray = {"blue", "red", "yellow"};     //This is how you say NOT Equal for Array. 
        String[] secondaryArray = {"pink", "orange", "green"};
        assertThat(primaryArray,not(equalTo(secondaryArray)));
    }
    
    //assertThat
    @Test
    public void testAssertThatEqual() {
      String testValue3 = "key3";                               //checks the value against the hashmap
      assertThat(test.getValue(testValue3),is("value 3"));      //Using the hamcrest.Corematchers here
      assertThat(test.getValue(testValue3),not("value 2"));
    }  
    
    //assertThat
    @Test
    public void testAssertThatObject() {                       //verifies that it is really a string
      String testValue1 = "key1";  
      assertThat(test.getValue(testValue1),isA(String.class));
    }
    
    //assertThat
    @Test
    public void that() throws Exception 
    {
      assertThat(test.getName("Susan"),is(notNullValue()));
  //  assertThat(test.getName(null),is(notNullValue()));       //fails as it should
    }
    
    
}
