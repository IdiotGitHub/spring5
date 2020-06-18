import com.xiaoxu.spring5.BeanLifeCycle;
import com.xiaoxu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo1 {
    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBeanLifeCycle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BeanLifeCycle beanLifeCycle = context.getBean("beanLifeCycle", BeanLifeCycle.class);
        System.out.println("Bean 生命周期第四步，获取Bean实例对象");
        System.out.println(beanLifeCycle);
        //要想执行销毁方法需要手动调用close方法
        ((ClassPathXmlApplicationContext)context).close();
    }

}
