package controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {


//    @Autowired
//    public Application() {
//        sessionFactory = new org.hibernate.cfg.Configuration().configure()
//                .buildSessionFactory();
//    }

    public static void main(String[] args) {
//        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
//        appContext.register(ApplicationContextConfig.class);
        SpringApplication.run(Application.class, args);
    }
}
