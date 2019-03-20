package cn.geek5.springcloudhystrix.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: CalcYu
 * Date: 2019/3/14
 */
//调用spring-cloud-producer提供的服务
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteImpl.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
