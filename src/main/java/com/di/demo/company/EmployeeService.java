package com.di.demo.company;

public class EmployeeService implements Employee {
  @Override
  public void showEmployeeInfo() {
	System.out.println("This is some Employee Information");
  }
}
