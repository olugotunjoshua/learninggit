//package Multitheading;
//
//import java.lang.*;
//
//public class Demo {
//    public static void main(String args[]) {
//        Multithread obj1 = new Multithread("one");
//        Multithread obj2 = new Multithread("two");
//        Multithread obj3 = new Multithread("three");
//
//        System.out.println("thread one is Alive " + obj2.t.isAlive());
//        System.out.println("thread two  is Alive " + obj2.t.isAlive());
//        System.out.println("thread three is Alive " + obj2.t.isAlive());
//
//        try {
//            System.out.println("Waiting for threads to finish.");
//            obj1.t.join();
//            obj2.t.join();
//            obj3.t.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main Thread is Interuppted");
//        }
//
//        System.out.println("thread one is Alive " + obj2.t.isAlive());
//        System.out.println("thread two  is Alive " + obj2.t.isAlive());
//        System.out.println("thread three is Alive " + obj2.t.isAlive());
//
//
//        System.out.println("Main Thread is exiting. ");
//
//    }
//}