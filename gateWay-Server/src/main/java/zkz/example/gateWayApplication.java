package zkz.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy   //开启网关功能
@EnableEurekaClient  //开启eureka的客户端功能，获取服务列表
public class gateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(gateWayApplication.class);
    }

}
