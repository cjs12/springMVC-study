package chapter02.impl;

import chapter02.dao.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/28.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt..,Peper is lonely Hearrts Club Band";

    private String artis = " The Beatles";

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artis);
    }
}
