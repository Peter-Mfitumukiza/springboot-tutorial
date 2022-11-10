package com.example.springDemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student peter = new Student("Peter", "peter@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 31));
            Student saad = new Student( "Saad", "saad@gmail.com",
                    LocalDate.of(2003, Month.MAY, 5));

            studentRepository.saveAll( List.of(peter, saad) );
        };
    }
}
