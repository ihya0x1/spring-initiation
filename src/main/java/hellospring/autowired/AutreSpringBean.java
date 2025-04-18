package hellospring.autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value = "autowiredBeanHelloWorld")
public class AutreSpringBean {
@Autowired
public HelloWorld autowiredHelloworld;
}
