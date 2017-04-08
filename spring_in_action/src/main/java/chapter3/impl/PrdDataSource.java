package chapter3.impl;

import chapter3.DataSource;
import org.springframework.stereotype.Component;

/**
 * Created by kevin on 17-4-8.
 */
@Component
public class PrdDataSource implements DataSource {
    public PrdDataSource()
    {
        System.out.println("Prd DataSource init.");
    }
}
