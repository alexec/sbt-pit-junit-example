package com.example
import org.junit.Test

class DogTest {

  val dog = new Dog

  @Test
  def dogsBark() = {
    assert("Bark" == dog.vocalise)
  }

}
