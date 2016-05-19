package com.example

import org.junit.{Assert, Test}

class AnimalTest {

  val animal = new Animal {
    override def vocalise() = ""
  }

  @Test
  def ageIsSetAge() = {
    animal.setAge(3)
    assert(3 == animal.getAge)
  }

  @Test
  def cannotSetAnimalAgeNegative() = {
    try {
      animal.setAge(-1)
      Assert.fail()
    } catch {
      case e: IllegalArgumentException => assert(e.getMessage == "Age cannot be negative")
      case _: Throwable => Assert.fail()
    }
  }
}
