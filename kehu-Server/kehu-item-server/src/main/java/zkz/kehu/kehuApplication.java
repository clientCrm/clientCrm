package zkz.kehu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan(basePackages = {"zkz.kehu.mapper"})
public class kehuApplication {
    public static void main(String[] args) {
        SpringApplication.run(kehuApplication.class);
    }
}
