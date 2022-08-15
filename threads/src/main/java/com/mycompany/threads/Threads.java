/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.threads;
//class A implements Runnable{
//  public void run(){
//  for(int i=0;i<10;i++){
//      
//      System.out.println("Class A "+i);
//  }
//}
//}
//  class B implements Runnable{
//  public void run(){
//  for(int i=0;i<10;i++){
//      
//      System.out.println("Class B "+i);
//  }
//}
//  }
class A extends Thread{
  public void run(){
  for(int i=0;i<10;i++){
//      try{
//      sleep(20);
//      }catch(Exception e){
//      System.out.println(e);
//      }
      System.out.println("Class A "+i);
  }
}
}
  class B extends Thread{
  public void run(){
  for(int i=0;i<10;i++){
//      try{
//      sleep(400);
//      }catch(Exception e){
//      System.out.println(e);
//      }
      System.out.println("Class B "+i);
  }
}
  }
class C extends Thread{
  public void run(){
  for(int i=0;i<10;i++){
      
      System.out.println("Class C "+i);
  }
}
  }
/**
 *
 * @author Computer Doctors
 */
public class Threads {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//Thread t1=new Thread(new A());
//Thread t2=new Thread(new B());
A t1=new A();
B t2=new B();
C t3=new C();


t3.start();
try{
      t3.join();
      }catch(Exception e){
      System.out.println(e);
      }
t1.start();
try{
      t1.sleep(20000);
      }catch(Exception e){
      System.out.println(e);
      }
t2.start();

//try{
//        
//t1.sleep(20000);
//        }
//catch(Exception e){
//System.out.println(e);
//}


//    }
}
}
  