import com.poming.boot.JpaApp;
import com.poming.boot.dao.PersonRepository;
import com.poming.boot.dto.NameOnly;
import com.poming.boot.entity.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author 没个破名怎活
 * @date 2022/7/11
 **/
@SpringBootTest(classes = {JpaApp.class})
public class JpaTest {

    @Resource
    private PersonRepository personRepository;

    @Test
    public void test(){
        List<NameOnly> personCollection = personRepository.findbyLastname("旭强");
        for (NameOnly person : personCollection) {
            System.out.println(person.ToString());
            System.out.println(person.getFirstname());
            System.out.println(person.getLastname());
            System.out.println(person.getMyHobby());
        }
        List<Person> personList = personRepository.findPerson("旭强");
        for (Person person : personList) {
            System.out.println(person.toString());
        }
        System.out.println("--------------");
        List<Person> personList1 = personRepository.findByFirstname("黄");
        for (Person person : personList1) {
            System.out.println(person.toString());
        }
    }

    @Test
    public void test1(){
        List<Person> byPage = personRepository.findByPage(2, 2);
        for (Person person : byPage) {
            System.out.println(person.toString());
        }
    }

}
