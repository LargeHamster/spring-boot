import com.poming.boot.WebSocketApp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * @author 没个破名怎活
 * @date 2022/6/29
 **/
@SpringBootTest(classes = WebSocketApp.class)
public class WebSocketTest {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Test
    public void test(){
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
    }

}
