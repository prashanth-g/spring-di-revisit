package com.prashanth.os.spring.di.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDIDemoApplication implements CommandLineRunner {

  @Qualifier("amdProcessor")
  @Autowired Processor amdProcessor;

  @Qualifier("intelProcessor")
  @Autowired Processor intelProcessor;

  public static void main(String[] args) {
    SpringApplication.run(SpringDIDemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    amdProcessor.setup();
    intelProcessor.setup();
    System.exit(1);
  }
}
