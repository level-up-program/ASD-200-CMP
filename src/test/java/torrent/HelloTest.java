package torrent;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"torrent"})
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