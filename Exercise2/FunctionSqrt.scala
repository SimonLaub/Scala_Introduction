// Getting started with Scala
//
// Created on Thu May 27 09:34:46 2021
// @author: Sila
//
// Newtons method for Sqrt. Recursion in Scala.
// Exercise 2
// Prog Spring 21 
// 
// NB.
// Scastie can run any Scala program with any library in your browser. 
// You don’t need to download or install anything:  https://scastie.scala-lang.org/
// 
// Sila May 24th 2021.

import scala.math.abs

def sqrtIter(guess: Double, x: Double): Double =
   if (IsGoodEnough(guess, x)) guess
   else sqrtIter(Improve(guess, x), x)

def IsGoodEnough(guess: Double, x: Double) =
   abs(guess*guess - x) <0.001

def Improve(guess: Double, x: Double) =
   (guess + x / guess) / 2

def mySqrt(x: Double) = sqrtIter(1.0, x)


println(mySqrt(16))
