package cn.geek5.springcloudhystrix.controller;

import cn.geek5.springcloudhystrix.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: CalcYu
 * Date: 2019/3/19
 */
@RestController
public class HystrixController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }


}
