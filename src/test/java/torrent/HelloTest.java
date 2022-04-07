package torrent;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;



public class HelloTest{

    @Test
    public void testHello(){
        //Given
        Hello hello = new Hello();
        //when
        String helloResult = hello.getHello();
        //then
        assertTrue("Hello is returned", "Hello".equals(helloResult));
    }
}