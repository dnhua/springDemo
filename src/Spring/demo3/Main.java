package Spring.demo3;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Spring/demo3/config/Beans.xml"));
        Student student = (Student) factory.getBean("Student");
        System.out.println(student);
    }
}
