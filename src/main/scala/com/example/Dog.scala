package com.example

/**
  * Dog is for demonstrating SBT+Scala mutation.
  */
class Dog extends Animal {
  var wags = 0

  override def vocalise: String = "Bark"

  def wagTail() = wags = wags + 1

  def getNumWags = wags
}
