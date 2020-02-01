package oop

object Main_object {
  def main(args: Array[String]) {
    var data: Shape = Shape.create("circle", 1, 0)
    println("-------------------------------------------")
    println(data.draw())
    var data1: Shape = Shape.create("cylinder", 1, 2)
    println(data1.draw())
    var data2: Shape = Shape.create("square", 2, 0)
    println(data2.draw())
    var data3: Shape = Shape.create("squarecuboid",2, 4)
    println(data3.draw())

    println("*******************************************")
    println("The volume of Cylinder is = "+new Cylinder(1,2).volume())
    println("The volume of SquareCuboid is = "+new SquareCuboid(2,4).volume())
    println("-------------------------------------------")


  }
}
