import com.spring.test.Entity.User;
import com.spring.test.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试入口
 *
 * @author : zhenghuang.wu
 * @version : v1.0
 * @date : 2021/8/10 13:10
 * @since : v1.0
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
}
