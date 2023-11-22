package com.cts.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean
    public Book book() {
        Book book = new Book();
        book.setTitle("The Atomic Habits");
        book.setAuthor("James Clear");
        return book;
    }

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("Aleena");
        student.setAge(20);
        return student;
    }


}
