package ResourceLoaderSpring;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component("resourceLoaderService")
public class ResourceLoaderService implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void showResourceDataUsingFilePath() throws IOException {
        Resource resource = new ClassPathResource("users.txt");
        if (!resource.exists() || !resource.isReadable()) {
            System.out.println("Файл не найден или не может быть прочитан");
        }
        InputStream input = resource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}