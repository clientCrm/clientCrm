package zkz.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
@SpringBootApplication
@EnableDiscoveryClient // 开启Eureka客户端
@EnableEurekaClient*/
@SpringCloudApplication
@EnableFeignClients // 开启feign客户端
public class managerServerApplication {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(managerServerApplication.class, args);
    }
}
