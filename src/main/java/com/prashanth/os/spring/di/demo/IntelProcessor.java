package com.prashanth.os.spring.di.demo;

import org.springframework.stereotype.Service;

@Service(value = "intelProcessor")
public class IntelProcessor implements Processor {

  @Override
  public void setup() {
    System.out.println("Setup Intel Processor");
  }
}
