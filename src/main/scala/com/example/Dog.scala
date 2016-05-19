package com.example

/**
  * Dog is for demonstrating SBT+Scala mutation.
  */
class Dog extends Animal {
  private val rabbitStrategy = () => "Bark"
  private var wags = 0

  override def vocalise = "Bark"

  def wagTail() = wags = wags + 1

  def getNumWags = wags

  def onRabbit() = rabbitStrategy()
}
