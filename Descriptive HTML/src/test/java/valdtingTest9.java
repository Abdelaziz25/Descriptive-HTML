import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.fail;

public class valdtingTest9 {
    @Test
    void main() throws ParseException {
        String test = "ADD LINK WITH TEXT \"Search\" AND WITH lINK \"http://google.com\"\n";
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
