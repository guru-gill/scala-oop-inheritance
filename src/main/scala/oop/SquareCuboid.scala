package oop

class SquareCuboid (var side:Int,var hight:Int)extends Square(side) {

  override def draw(): String = s"This is the Area of Square Cuboid: ${area()}"

  def volume(): Double = side*side*hight



  override def area(): Double = (super.area()+super.area()*(4*side*hight))
}
