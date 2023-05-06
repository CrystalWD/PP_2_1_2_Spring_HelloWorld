import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHello2 =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(beanHello2.getMessage());

        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean1.getName()+"\n"+catBean2.getName());
        System.out.println(bean==beanHello2);
        System.out.println(catBean1==catBean2);
    }
}