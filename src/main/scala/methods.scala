package org.p99.scala

import java.util.NoSuchElementException

object methods {

  def last[A](list: List[A]): A = list match {
    case value :: Nil => value
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def penultimate[A](list: List[A]): A = list match {
    case value :: _ :: Nil => value
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def nth[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, value :: _) => value
    case (n, _ :: tail) => nth(n - 1, tail)
    case _ => throw new NoSuchElementException
  }

  def length[A](list: List[A]): Int = list match {
    case _ :: Nil => 0
    case _ :: tail => 1 + length(tail)
  }

  def reverse[A](list:List[A]): List[A] = {
    list.foldLeft(List.empty[A]) {(a, b) => b :: a}
  }

  def isPalindrome[A](list:List[A]): Boolean = {
    list.foldLeft(List.empty[A]) {(a, b) => b :: a} == list
  }

  def flatten(list: List[_]): List[_] = list match{
    case List() => List()
    case (al:List[_]) :: (bl:List[_]) => flatten(al) ::: flatten(bl)
    case a :: (bl:List[_]) => List(a) ::: flatten(bl)
  }

  def compress[A](list:List[A]): List[A] = list match {
    case Nil => Nil
    case e :: tail => e :: compress(tail.dropWhile(_ == e))
  }

  def pack[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list.span(_ == list.head)
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  def encode[A](list:List[A]): List[(Int, A)] = {
    pack(list).map(e => (e.length, e.head))
  }

  def decode[A](list:List[(Int, A)]): List[A] = {
    list.flatMap(e => Stream.fill(e._1)(e._2))
  }

  def encodeDirect[A](list:List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, next) = list.span(_ == list.head)
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }

//思い出
//  def duplicate[A](list: List[A]): List[A] = list match {
//    case Nil => Nil
//    case e :: tail => e :: e :: duplicate(tail)
//  }

  def duplicate[A](list: List[A]): List[A] = list.flatMap(e => List(e, e))

}