package cn.geek5.springcloudrobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SpringCloudRobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRobotApplication.class, args);
	}

}
