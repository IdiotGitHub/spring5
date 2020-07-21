import com.xiaoxu.dao.Money;
import com.xiaoxu.service.MoneyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @create 2020 -07 -21 16:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class JTest4 {
    @Resource
    private MoneyService money;
    @Test
    public void test1() {
        money.transferAccount("jack", "tom", BigDecimal.valueOf(100));
    }
}
