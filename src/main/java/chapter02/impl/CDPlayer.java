package chapter02.impl;

import chapter02.dao.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/28.
 */
@Component
public class CDPlayer {

    @Autowired
    private CompactDisc cd;

    public CDPlayer() {
    }

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
