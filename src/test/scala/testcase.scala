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

  describe("problem5") {
    it("should return reversed") {
      val list = List(1,2,3,4,5,6)
      val expected = List(6,5,4,3,2,1)
      assert(reverse(list) == expected)
    }
  }

  describe("problem6") {
    it("should return is回文") {
      val list = List(1,2,3,2,1)
      assert(isPalindrome(list))
    }
  }

  describe("problem7") {
    it("should return flatten") {
      val list = List(List(1,2,3), List(4,5))
      val expected = List(1,2,3,4,5)
      assert(flatten(list) == expected)
    }
  }

  describe("problem8") {
    it("should return compressed") {
      val list = List(1,1,2,3,4,5,5)
      val expected = List(1,2,3,4,5)
      assert(compress(list) == expected)
    }
  }

  describe("problem9") {
    it("should return packed") {
      val list = List(1,1,2,3,4,5,5)
      val expected = List(List(1,1), List(2), List(3), List(4), List(5,5))
      assert(pack(list) == expected)
    }
  }

  describe("problem9") {
    it("should return encoded") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      assert(encode(list) == expected)
    }
  }

  describe("problem10") {
    it("should return decoded") {
      val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      assert(decode(list) == expected)
    }
  }

  describe("problem11") {
    it("should return direct encoded") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      assert(encodeDirect(list) == expected)
    }
  }

  describe("problem12") {
    it("should return duplicated") {
      val list = List('a, 'b, 'b, 'c, 'd, 'd)
      val expected = List('a, 'a, 'b, 'b, 'b, 'b, 'c, 'c, 'd, 'd, 'd, 'd)
      assert(duplicate(list) == expected)
    }
  }

}

