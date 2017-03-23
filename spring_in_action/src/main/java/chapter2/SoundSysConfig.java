package chapter2;

import chapter2.soundsystem.CompactDisc;
import chapter2.soundsystem.MediaPlayer;
import chapter2.soundsystem.impl.CDPlayer;
import chapter2.soundsystem.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.print.attribute.standard.Media;

/**
 * Created by Administrator on 2017/3/22.
 */
@Configuration
@ComponentScan(basePackageClasses = SoundSysConfig.class)
public class SoundSysConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
