package com.example.demo;

import com.example.demo.entity.Drug;
import com.example.demo.repo.DrugRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private DrugRepository drugRepository;

    @PostConstruct
    public void createDrug() {
        Drug drug = new Drug("Paracetamol", "Painkiller", 10.00, "Pfizer", "Tablet", 1);
        drugRepository.save(drug);
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello World!");


    }


    public void doSomething() {
        drugRepository.findByName("Paracetamol");
    }

}
