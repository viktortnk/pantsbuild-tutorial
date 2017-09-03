package com.example.greeter

import org.scalatest.FunSuite

class GreeterTest extends FunSuite {

  test("Greeter should properly append name") {
    assert(Greeter.greet("Dave") === "Hello Dave")
  }
}