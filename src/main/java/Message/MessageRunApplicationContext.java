package Message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("message-bean.xml");

        Message message = (Message) context.getBean("fromBeanMessage");

        System.out.println(message.getMessage());
    }
}
