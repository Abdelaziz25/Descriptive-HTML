import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class testing3 {
    @Test
    void main() throws ParseException {
        String test = "ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"";
        InputStream testing = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));
        valdting valid;
        valid=new valdting(new InputStreamReader(testing));
        Assertions.assertEquals( "<p style=\"font-family:Arial;color:Red;\">Welcome</p>",valid.Input());
    }
}
