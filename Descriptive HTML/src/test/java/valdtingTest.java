import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class valdtingTest {

    @Test
    void main() throws ParseException {
        String test = "ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pictrulli.jpg\"";
        InputStream testing = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));
        valdting valid;
        String vv;
        valid=new valdting(new InputStreamReader(testing));
        try {
            valid.Input();
            // more testing code
        } catch (Exception e) {
            fail("Syntax Error");
        }
    }
}