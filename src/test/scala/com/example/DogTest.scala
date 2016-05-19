package com.example
import org.junit.Test

class DogTest {

  val dog = new Dog

  @Test
  def dogsBark() = {
    assert("Bark" == dog.vocalise)
  }

  @Test
  def waggingTail() = {
    dog.wagTail()
    assert(1 == dog.getNumWags)
  }

  @Test
  def seeingRabbitCausedDogToBark() = {
    assert("Bark" == dog.onRabbit())
  }
}
