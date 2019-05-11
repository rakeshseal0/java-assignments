//copied assgn

import java.lang.*; // import language package
 
interface Gross // interface declaration
{
 double ta=800.0;
 double da=1500.0; // final variable
 void gross_sal();
}
 
class Employee // super class declaration
{
 String name; // data member declaration
 float basic_sal;
 
 Employee(String n, float b) // super class constructor
 {
  name=n;
  basic_sal=b;
 }
 
 void display() // method to display value of data member
 {
  System.out.println("Name of Employee : "+name);
  System.out.println("Basic Salary of Employee : "+basic_sal);
 }
}
 
class Salary extends Employee implements Gross // sub class constructor
{
 float hra;
 
 Salary(String n, float b, float h) // sub class constructor
 {
  super(n,b);
  hra=h;
 }
 
 void disp()
 {
  display();
  System.out.println("HRA of Employee : "+hra);
 }
 
 public void gross_sal() // method to calculate gross salary
 {
  double gross_sal=basic_sal + ta + da + hra;
  System.out.println("TA of Employee : "+ta);
  System.out.println("DA of Employee : "+da);
  System.out.println("Gross Salary of Employee : "+gross_sal);
 }
}
 
class ass45 {
 
 public static void main(String args[]) // main method
 {
  Salary s = new Salary("Sachin",8000,3000); // initiating Sub class
  s.disp(); // invoke method of sub class
  s.gross_sal();
 }
}