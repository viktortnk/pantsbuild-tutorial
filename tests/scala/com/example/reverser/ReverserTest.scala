package com.example.reverser

import org.scalatest.FunSuite

class ReverserTest extends FunSuite {

  test("Reverser should reverse string") {
    assert(Reverser.reverse("Dave") === "evaD")
  }
}