package ResourceLoaderSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ResourceLoaderApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ResourceLoaderApplication.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        ResourceLoaderService resourceLoaderService = applicationContext.getBean("resourceLoaderService", ResourceLoaderService.class);
        resourceLoaderService.showResourceDataUsingFilePath();
    }
}