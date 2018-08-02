package web.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//直接右键 run 启动Tomcat 容器
@SpringBootApplication //这个注解是springboot 帮你自动配置到spirng 容器里配置
@MapperScan("web.video.mapper")//这个 是寻找mapper
public class VideoApp {

    public static  void main(String[] args){
        SpringApplication.run(VideoApp.class, args);
    }
}
