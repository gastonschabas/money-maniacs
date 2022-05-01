package com.gaston.schabas.money.maniacs

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class HelloTest extends AnyFunSuite with Matchers {

  test("1 should be equals 1") {
    1 should be(1)
  }

  test("1 should not be equals 2") {
    1 should not be(2)
  }

}
