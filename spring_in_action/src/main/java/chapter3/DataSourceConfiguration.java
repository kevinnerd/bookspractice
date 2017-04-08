package chapter3;

import chapter3.impl.DevDataSource;
import chapter3.impl.PrdDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by kevin on 17-4-8.
 */
@Configuration
public class DataSourceConfiguration {

    @Bean
    @Profile("dev")
    public DataSource devDataSource(){
        return new DevDataSource();
    }

    @Bean
    @Profile("prd")
    public DataSource prdDataSource(){
        return new PrdDataSource();
    }
}
