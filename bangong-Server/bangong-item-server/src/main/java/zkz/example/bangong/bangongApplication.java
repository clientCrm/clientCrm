package zkz.example.bangong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan(basePackages = {"zkz.example.bangong.mapper"})
public class bangongApplication {
    public static void main(String[] args) {
        SpringApplication.run(bangongApplication.class);
    }
}
