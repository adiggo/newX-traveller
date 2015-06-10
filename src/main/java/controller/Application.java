package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by i843719 on 11/15/14.
 */
@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {


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
