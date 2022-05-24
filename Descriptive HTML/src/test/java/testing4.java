import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class testing4 {
    @Test
    void main() throws ParseException {
        String test = "ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com\"\n";
        InputStream testing = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));
        valdting valid;
        valid=new valdting(new InputStreamReader(testing));
        Assertions.assertEquals( "<a href=\"http://google.com\">Search</a>",valid.Input());
    }
}
