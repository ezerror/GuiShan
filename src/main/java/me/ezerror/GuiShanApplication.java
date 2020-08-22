package me.ezerror;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.ezerror.dao.mapper")
public class GuiShanApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuiShanApplication.class, args);
    }
}
