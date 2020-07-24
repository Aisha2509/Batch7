package com.syntax.class01;

public class Employee {
int eID;
double salary;
static String CEO="Sumair";
void info() {
	System.out.println(Employee.CEO);
	

System.out.println("Employee with the ID "+eID+ " has salary "+salary+"and the CEO of him is "+CEO);
}
}
