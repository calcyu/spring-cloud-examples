package cn.geek5.springcloudrobot.controller;

import cn.geek5.springcloudrobot.config.MysqlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: CalcYu
 * Date: 2019/2/28
 */
@RestController
public class GetConfigController {

    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String password;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("userinfo")
    public String getUserInfo() {
        return String.format("用户名：%s，密码：%s", userName, password);
    }

    @Autowired
    private MysqlConfig mysqlConfig;

    @GetMapping("mysql")
    public String getMysql() {
        return String.format("用户名：%s，密码：%s", mysqlConfig.getUsername(), mysqlConfig.getPassword());
    }

    @GetMapping("appname")
    public String getAppName(){
        return appName;
    }

}
