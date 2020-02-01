package oop

class Circle(r: Int)  extends  Shape {
  private var radius:Int=r;

  override def draw(): String = s"This is the Area of Circle: ${area()}"
  override def area(): Double = Circle.pi * radius * radius
}

object Circle
{
  val pi: Double = 3.14
}

