package oop

class Cylinder(radius: Int, height: Int) extends  Circle(radius)  {
  override def draw(): String = s"This is a Cylinder: ${area()}"
  override def area(): Double = (2 * Circle.pi * radius * height) + (2*(super.area()))

  def volume(): Double = {
    val pie:Double= 3.14285714286
    return pie * (radius * radius) * height
  }

}