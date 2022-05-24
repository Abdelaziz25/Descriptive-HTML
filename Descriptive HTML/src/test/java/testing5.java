import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class testing5 {
    @Test
    void main() throws ParseException {
        String test = "ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" WITH COLOR \"Green\"";
        InputStream testing = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));
        valdting valid;
        valid=new valdting(new InputStreamReader(testing));
        Assertions.assertEquals( "<a href=\"http://gmail.com\" style=\"color:Green;\">Email</a>",valid.Input());
    }
}
