package org.p99.scala

import java.util.NoSuchElementException

object methods {

  def last[A](list: List[A]): A = list match {
    case value :: Nil  => value
    case _ :: tail => last(tail)
    case _         => throw new NoSuchElementException
  }

  def penultimate[A](list:List[A]) : A = list match {
    case value :: _ :: Nil => value
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def nth[A](n:Int, list:List[A]): A = (n, list) match {
    case (0, value :: _) => value
    case (n, _ :: tail) => nth(n-1, tail)
    case _ => throw new NoSuchElementException
  }

  def length[A](list:List[A], n:Int = 0): Int = list match {
    case _ :: Nil => n
    case _ :: tail => length(tail, n+1)
  }

}
