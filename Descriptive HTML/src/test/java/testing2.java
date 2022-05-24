import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class testing2 {
    @Test
    void main() throws ParseException {
        String test = "ADD HEADING WITH TEXT \"HelloWorld\"";
        InputStream testing = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));
        valdting valid;
        valid=new valdting(new InputStreamReader(testing));
        Assertions.assertEquals( "<h1>HelloWorld</h1>",valid.Input());
    }
}
