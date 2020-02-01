package oop

class Square(side:Int) extends Shape {
  var s:Int=side
  override def draw(): String = s"This is the Area of Square: ${area()}"

  override def area(): Double =  s * s

}

