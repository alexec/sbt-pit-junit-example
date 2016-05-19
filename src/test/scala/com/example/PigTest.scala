package com.example

import org.junit.Test

class PigTest {

  val pig = new Pig

  @Test
  def rubbishTest() = {
    pig.vocalise
    print() // make void return type
  }
}
