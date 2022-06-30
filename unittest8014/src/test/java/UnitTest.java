import com.poming.boot.UnitTestApp;
import com.poming.boot.service.HelloService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;

/**
 * @author 没个破名怎活
 * @date 2022/6/30
 **/
@SpringBootTest(classes = {UnitTestApp.class})
public class UnitTest {

    @Resource
    private HelloService helloService;

    @Test
    public void test(){
        String hello = helloService.sayHello("Michael");
    }

}
