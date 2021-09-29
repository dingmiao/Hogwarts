package scu.debate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "scu.debate")
@MapperScan("scu.debate.dao.DAO")
public class DebateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DebateApplication.class, args);
    }

}
