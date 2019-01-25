package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import sample.config.SessionSharing.CuixbCookieSerializer;

@Configuration
@EnableRedisHttpSession
public class SessionSharingConfig {

//    @Bean
//    public CookieHttpSessionStrategy cookieHttpSessionStrategy() {
//        CookieHttpSessionStrategy strategy = new CookieHttpSessionStrategy();
//        strategy.setCookieSerializer(new CuixbCookieSerializer());
//        return strategy;
//    }

}
