import com.spring.test.Entity.User;
import com.spring.test.Test.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : zhenghuang.wu
 * @version : v1.0
 * @date : 2021/8/10 13:10
 * @since : v1.0
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("test-start");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
		System.out.println("test-end");
	}
}
