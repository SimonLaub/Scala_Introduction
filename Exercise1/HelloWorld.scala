// Getting started with Scala
//
// Created on Wed May 26 16:23:11 2021
// @author: Sila
//
// Hello world in Scala.
// Exercise 1
// Prog Spring 21 
//
// NB.
// Scastie can run any Scala program with any library in your browser. 
// You don’t need to download or install anything: https://scastie.scala-lang.org/
// 
// Sila May 24th 2021.


println("hello world")

val msg = "Hello, world!"

println(msg)

val greeting = "Leave me alone, world!"

def max(x: Int, y: Int): Int = {
         if (x > y) x
          else y
        }

println(max(4, 34))

var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

i = 0
  while (i < 10) {
    if (i != 0) {
      print(" ");
    }
    print(i);
    i += 1;
  }
  println();
