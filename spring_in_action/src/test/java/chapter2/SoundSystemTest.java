package chapter2;

import chapter2.soundsystem.CompactDisc;
import chapter2.soundsystem.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/3/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = SoundSysConfig.class)
@ContextConfiguration(locations = "classpath:chapter2-config/soundsys-config.xml")
public class SoundSystemTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private MediaPlayer player;

    @Test
    public void notNullTest(){
        assertNotNull(cd);
        assertNotNull(player);
    }

    @Test
    public void playerTest(){
        player.play();
    }
}
