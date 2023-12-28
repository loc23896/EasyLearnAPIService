package com.easy.learn;

import com.easy.learn.Enum.Gender;
import com.easy.learn.Enum.Status;
import com.easy.learn.entity.*;
import com.easy.learn.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring start!!!");
    }

}
