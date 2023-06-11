import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorldOutput() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method of HelloWorld class
        HelloWorld.main(new String[]{});

        // Get the output from System.out
        String output = outputStream.toString().trim();

        // Verify the output is "Hello world!"
        assertEquals("Hello world!", output);
    }
}
