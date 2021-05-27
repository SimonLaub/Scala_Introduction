// Getting started with Scala
//
// Prog Spring 21 
// Created on Thu May 27 15:23:17 2021
// @author: Sila
// 
// Exercise 4.
// Hello World, Passing Functions in Scala.
// Prog Spring 21 
// 
// NB.
// Scastie can run any Scala program with any library in your browser. 
// You don’t need to download or install anything:  https://scastie.scala-lang.org/
// 
// 
// Sila May 24th 2021.

val name = "John Doe"
"hello".head
"hello".tail
"hello, world".take(5)
println("hi")
1 + 2 * 3
(1 + 2) * 3
if (2 > 1) println("greater") else println("lesser")

val nums = (1 to 10).toList

val doubles = nums.map(_ * 2)
val lessThanFive = nums.filter(_ < 5)

println(doubles)
println(lessThanFive)

def doubler(i: Int): Int = i * 2 
val newdoubles = nums.map(doubler)
println(newdoubles)

List("foo", "bar").map(_.toUpperCase)
List("foo", "bar").map(_.capitalize)
List("adam", "scott").map(_.length)
List(1,2,3,4,5).map(_ * 10)
List(1,2,3,4,5).filter(_ > 2)
List(5,1,3,11,7).takeWhile(_ < 6)


// A pure function in Scala. No side effects.
println(Math.sqrt(4))

def getOps(c: Int) = {
  def doubler(x: Int) = x * 2
  def tripler(x: Int) = x * 3
  if (c > 0)
    doubler _
  else
    tripler _
}

val r = 1 to 10
r.map(getOps(4))
r.map(getOps(-4))


