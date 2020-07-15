import com.xiaoxu.config.TransactionConfig;
import com.xiaoxu.service.MoneyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @create 2020 -07 -15 14:44
 */
public class TestMoney {
    @Test
    public void testTransferAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MoneyService moneyService = context.getBean("moneyService", MoneyService.class);
        moneyService.transferAccount("jack", "tom", BigDecimal.valueOf(200));
    }    @Test
    public void testTransferAccountByAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
        MoneyService moneyService = context.getBean("moneyService", MoneyService.class);
        moneyService.transferAccount("jack", "tom", BigDecimal.valueOf(200));
    }
}
