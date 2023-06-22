package PersonSpringValidator;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class PersonTest {
    public static void main(String[] args) {
        BeanWrapper company = new BeanWrapperImpl(new Company());
        company.setPropertyValue("name", "Philip Morris");

        BeanWrapper dmitry = new BeanWrapperImpl(new Person());
        dmitry.setPropertyValue("name", "Dmitry Smirnov");
        company.setPropertyValue("manager", dmitry.getWrappedInstance());

    }
}
