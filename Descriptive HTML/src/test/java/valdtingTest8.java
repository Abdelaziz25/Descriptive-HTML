import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.fail;

public class valdtingTest8 {
    @Test
    void main() throws ParseException {
        String test = "ADD PARAGRAPH WITH EXT Welcome AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"";
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
