package chapter2.soundsystem.impl;

import chapter2.soundsystem.CompactDisc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/22.
 */
@Component("sgtPeppers")
public class SgtPeppers implements CompactDisc {
    @Value("CherryLoveKevin")
    private String title;
    @Value("Kevin")
    private String author;

    public void play() {
        System.out.println(title + " played by " + author);
    }
}
