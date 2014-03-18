import com.sunshine.spring.aop.service.IHelloWorldService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午3:28
 * To change this template use File | Settings | File Templates.
 */
public class AOPTest {

    @Test
    public void testHelloworld() {
       ApplicationContext ctx =  new ClassPathXmlApplicationContext("springaop.xml");
        IHelloWorldService helloworldService =
                ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloworldService.sayHello( );
    }

    @Test
    public void testAnnotaionHelloworld() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springaopAnnoation.xml");
        IHelloWorldService helloworldService =
                ctx.getBean("helloWorldService", IHelloWorldService.class);
        helloworldService.sayAnnoHello("AnnoationAOPTest");
    }
}
