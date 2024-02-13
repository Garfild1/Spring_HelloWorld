import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean11 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.equals(bean11));


        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat bean22 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.equals(bean22));


    }
}