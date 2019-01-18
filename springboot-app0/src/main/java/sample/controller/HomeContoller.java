package sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class HomeContoller {
    @Value("${configserver.msg.test}")
    String configServerMessage;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello app000000!" + configServerMessage;
    }
}
