// Getting started with Scala
//
// Prog Spring 21 
// Created on Thu May 27 11:01:18 2021
// @author: Sila
// 
// Exercise 3.
// Random, Recursion and Functional programming in Scala.
// Prog Spring 21 
// 
// NB.
// Scastie can run any Scala program with any library in your browser. 
// You don’t need to download or install anything:  https://scastie.scala-lang.org/
// 
// Sila May 24th 2021.

// Random in Scala
// https://alvinalexander.com/scala/how-to-generate-random-numbers-characters-sequences-in-scala/

val r = scala.util.Random

r.nextInt(100)

print(r.nextInt(100))

// Recursion in Scala
// Recursion example calculating factorials
def factorial(num : BigInt) : BigInt = {
  if (num <= 1)
    1
  else
    num * factorial(num - 1)
}

println(factorial(100))

// Create an array of Ints with a max size of 20
val favNums = new Array[Int](20)

// Add values to an array with a loop
for (j <- 0 to (favNums.length - 1)){
  favNums(j) = j
  println(favNums(j))
}

// Functional programming in Scala
// Use yield to multiply all values times 2 and store in a new array
val favNumsTimes2 = for(num <- favNums) yield 2 * num
for (j <- 0 to (favNumsTimes2.length - 1)){
  println(favNumsTimes2(j))
}

// You can also store values that match a condition
var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num
for (j <- 0 to (favNumsDiv4.length - 1)){
  println(favNumsDiv4(j))
}

