// Getting started with Scala
//
// Created on Wed May 26 08:04:30 2021
// @author: Sila
//
// Hello world (2) in Scala.
// Exercise 1
// Prog Spring 21 
// 
// NB.
// Scastie can run any Scala program with any library in your browser. 
// You don’t need to download or install anything:  https://scastie.scala-lang.org/
//
// Sila May 24th 2021.
//
// lists

val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(""+ oneTwo +" and "+ threeFour +" were not mutated.")
  println("Thus, "+ oneTwoThreeFour +" is a new list.")

 val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)

//Tuples
val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)

//Sets
var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  println(jetSet.contains("Cessna"))


