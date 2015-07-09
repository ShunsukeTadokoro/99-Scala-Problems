package org.p99.scala

import org.scalatest._
import org.p99.scala.methods._

class Testcase extends FunSpec {

  describe("problem1") {
    it("should return last element") {
      val list = List(1,2,3,4,5,6)
      assert(last(list) == 6)
    }
  }

  describe("problem2") {
    it("should return last but one element") {
      val list = List(1,2,3,4,5,6)
      assert(penultimate(list) == 5)
    }
  }

  describe("problem3") {
    it("should return Nth element") {
      val list = List(1,2,3,4,5,6)
      assert(nth(2, list) == 3)
    }
  }

  describe("problem4") {
    it("should return length") {
      val list = List(1,2,3,4,5,6)
      assert(length(list) == 5)
    }
  }

}

