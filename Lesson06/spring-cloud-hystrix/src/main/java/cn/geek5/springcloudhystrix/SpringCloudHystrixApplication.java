package cn.geek5.springcloudhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixApplication.class, args);
	}

}
