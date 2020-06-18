import com.xiaoxu.spring5.User;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
public class Main {
    @Resource
    private static User user;
    public static void main(String[] args) {
        user.add();
    }
}
