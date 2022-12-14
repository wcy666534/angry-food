package org.angryfood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.angryfood.dao"})
public class AngryFoodMain
{
    public static void main( String[] args )
    {
        SpringApplication.run(AngryFoodMain.class);
    }
}
