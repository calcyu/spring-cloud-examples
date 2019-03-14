package cn.geek5.springcloudproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 *  Edgware版本之后可以省略`@EnableDiscoveryClient` 注解，会自动注册到服务中心。
  如不想注册到服务中心，只需设置spring.cloud.service-registry.auto-registration.enabled=false ，
 或@EnableDiscoveryClient(autoRegister = false) 即可。
 */
@EnableDiscoveryClient
public class SpringCloudProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProducerApplication.class, args);
	}

}
