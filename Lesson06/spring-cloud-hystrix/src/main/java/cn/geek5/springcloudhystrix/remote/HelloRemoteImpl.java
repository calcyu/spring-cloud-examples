package cn.geek5.springcloudhystrix.remote;

import org.springframework.stereotype.Component;

/**
 * Author: CalcYu
 * Date: 2019/3/19
 */
@Component
public class HelloRemoteImpl implements HelloRemote {
    @Override
    public String hello(String name) {
        return "拼命加载中...";
    }
}
