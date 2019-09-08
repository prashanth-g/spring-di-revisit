package com.prashanth.os.spring.di.demo;

import org.springframework.stereotype.Service;

@Service(value = "amdProcessor")
public class AMDProcessor implements Processor {

  @Override
  public void setup() {
    System.out.println("Setup AMDProcessor");
  }
}
