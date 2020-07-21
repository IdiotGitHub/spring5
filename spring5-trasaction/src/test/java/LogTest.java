import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 * @create 2020 -07 -21 16:12
 */
public class LogTest {
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        log.info("hello");
        log.error("error");
    }
}
