package config;

import chapter02.dao.CompactDisc;
import chapter02.impl.CDPlayer;
import chapter02.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/6/28.
 */
// TODO 自动扫描Bean类
/*@Configuration
@ComponentScan(basePackages = "chapter02")
public class ComponentConfig {
}*/

@Configuration
public class ComponentConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
//        return new CDPlayer();
        return new CDPlayer(sgtPeppers());
    }
}
