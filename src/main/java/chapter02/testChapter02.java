package chapter02;

import static org.junit.Assert.*;

import chapter02.dao.CompactDisc;
import chapter02.impl.CDPlayer;
import chapter02.impl.SgtPeppers;
import config.ComponentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentConfig.class)
public class testChapter02 {

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private CompactDisc cd;

    @Test
    public void testCompactDisc() {
        cd.play();
        assertNotNull(cd);
    }

    @Test
    public void testCDPlayer() {
        cdPlayer.play();
    }
}
