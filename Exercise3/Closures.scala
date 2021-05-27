// Getting started with Scala
//
// Created on Thu May 27 10:30:18 2021
// @author: Sila
//
// Exercise 3.
// Closures in Scala.
// Prog Spring 21 
// 
// NB.
// Scastie can run any Scala program with any library in your browser. 
// You don’t need to download or install anything:  https://scastie.scala-lang.org/
// 
// 
// Sila May 24th 2021.

// Closures

var increase = (x: Int) => x + 1

println(increase(1))

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))

println(someNumbers.filter((x: Int) => x > 0))

//Closures

var more = 1
val addMore = (x: Int) => x + more
println(addMore(7))

def makeIncreaser(extramore: Int) = (x: Int) => x + extramore

val inc1 = makeIncreaser(1)
val inc2 = makeIncreaser(2)

println(inc1(1))
println(inc2(1))


