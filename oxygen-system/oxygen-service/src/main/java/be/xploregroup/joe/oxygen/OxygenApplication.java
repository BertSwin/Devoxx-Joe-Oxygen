package be.xploregroup.joe.oxygen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by bertswinnen on 26/09/15.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class OxygenApplication extends SpringBootServletInitializer {
    private static Logger logger = LoggerFactory.getLogger(OxygenApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OxygenApplication.class);
    }

    public static void main(String[] args) {
        new OxygenApplication().configure(
                new SpringApplicationBuilder(OxygenApplication.class)).run(args);
    }
}
