package cai.com.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * Created by cai on 2019/2/24.
 * 启动类
 */
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }

    @Bean //@Bean 将(自动生成id)方法的返回值放到容器中
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
